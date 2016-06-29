package com.example.TrainiaTeam.Trainia;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.facebook.FacebookSdk;
import com.google.android.gms.common.SignInButton;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import java.util.LinkedList;
import java.util.List;

import TrainiaDB.gen.User;
import TrainiaDB.gen.UserDAO;
import TrainiaDB.gen.UserDAOImpl;
import TrainiaDB.runtime.query.AExp;
import TrainiaDB.runtime.query.SelectQuery;
import TrainiaDB.runtime.util.SimpleSQLiteOpenHelper;
import TrainiaDB.runtime.util.handlers.IntegerResultSetHandler;


public class Sign_In extends AppCompatActivity implements Validator.ValidationListener {

    @NotEmpty
    private EditText edtEmail;
    @NotEmpty
    private EditText edtPass;
    private String sEmail,sPass;
    private Button btnSignIn,FbloginButton;
    private ImageButton btnSignUp,btnForgotPass;
    private Validator validator;
    private Integer res,res2;
    private SessionManager manager;
    private List Users = new LinkedList();
    private User userObj;
    private SignInButton GMloginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FacebookSdk.sdkInitialize(getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in);

        edtEmail = (EditText) findViewById(R.id.mail_sign);
        edtPass = (EditText) findViewById(R.id.pass);
        btnSignIn = (Button) findViewById(R.id.SignIn);
        btnSignUp = (ImageButton) findViewById(R.id.SignUp);
        btnForgotPass = (ImageButton) findViewById(R.id.forgotPass);
        FbloginButton = (Button)  findViewById(R.id.Facebook);
        GMloginbtn = (SignInButton) findViewById(R.id.Gmail);

        manager = new SessionManager();

        validator = new Validator(this);
        validator.setValidationListener(this);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validator.validate();
                signInPass();
                signInEmail();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Sign_up.class));
            }
        });

        FbloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.Fragment fragment = fm.findFragmentById(R.id.fragment_container);

                if (fragment == null) {
                    fragment = new FacebookFragment();
                    fm.beginTransaction()
                            .add(R.id.fragment_container, fragment)
                            .commit();
                }
            }
        });

        GMloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GmailLogin.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
        System.exit(0);
    }

    @Override
    public void onValidationSucceeded() {
        if(signInEmail() && signInPass()) {
            manager.setPreferences(Sign_In.this, "status", "1");

            SimpleSQLiteOpenHelper helper = new DatabaseHelper(getApplicationContext());
            UserDAO userDAO = new UserDAOImpl(helper);
            Users = userDAO.getUserList(userDAO.EMAIL.eq(sEmail));
            userObj = (User) Users.get(0);
            Toast.makeText(this, String.valueOf(userObj.getName()), Toast.LENGTH_LONG).show();

            manager.setPreferences(Sign_In.this, "id", String.valueOf(userObj.getId()));

            startActivity(new Intent(getApplicationContext(), Profile.class));

        }else if(!signInEmail()){
            showErrorEmail();
        }else if(!signInPass()){
            showErrorPass();
        }
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        for (ValidationError error : errors) {
            View view = error.getView();
            String message = error.getCollatedErrorMessage(this);

            // Display error messages ;)
            if (view instanceof EditText) {
                ((EditText) view).setError(message);
            } else {
                Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            }
        }
    }

        public boolean signInPass(){
            boolean found = false;
            sPass = String.valueOf(edtPass.getText());
            SimpleSQLiteOpenHelper helper = new DatabaseHelper(Sign_In.this);
            UserDAO userDAO = new UserDAOImpl(helper);
            SelectQuery selectQuery2 = new SelectQuery(userDAO.TABLE_EXPRESSION);
            selectQuery2.setColumnExpression(AExp.fun("count", userDAO.ID))
                    .where(userDAO.PASSWORD.eq(sPass));
            res2 = userDAO.select(selectQuery2, new IntegerResultSetHandler()).getObjectList().get(0);
            Toast.makeText(this, "pass"+res2, Toast.LENGTH_LONG).show();
            if (res2 == 0) {
                found = false;
            }else if(res2 == 1) {
                found = true;
            }
            return found;
        }

        public boolean signInEmail() {
            boolean found = false;
            sEmail = String.valueOf(edtEmail.getText());
            SimpleSQLiteOpenHelper helper = new DatabaseHelper(Sign_In.this);
            UserDAO userDAO = new UserDAOImpl(helper);
            SelectQuery selectQuery = new SelectQuery(userDAO.TABLE_EXPRESSION);
            selectQuery.setColumnExpression(AExp.fun("count", userDAO.ID))
                    .where(userDAO.EMAIL.eq(sEmail));
            res = userDAO.select(selectQuery, new IntegerResultSetHandler()).getObjectList().get(0);
            Toast.makeText(this, "mail"+res, Toast.LENGTH_LONG).show();
            if (res == 0) {
                found = false;
            }else if(res == 1) {
                found = true;
            }
            return found;
    }

        private void showErrorEmail() {
        edtEmail.setError("Invalid Email");
        }
        private void showErrorPass() {
            edtPass.setError("Invalid Password");
        }
    }
