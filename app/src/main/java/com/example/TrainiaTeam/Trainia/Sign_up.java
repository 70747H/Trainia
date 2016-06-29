package com.example.TrainiaTeam.Trainia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.Min;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Password;

import java.util.LinkedList;
import java.util.List;

import TrainiaDB.gen.User;
import TrainiaDB.gen.UserDAO;
import TrainiaDB.gen.UserDAOImpl;
import TrainiaDB.runtime.query.AExp;
import TrainiaDB.runtime.query.SelectQuery;
import TrainiaDB.runtime.util.SimpleSQLiteOpenHelper;
import TrainiaDB.runtime.util.handlers.IntegerResultSetHandler;

public class Sign_up extends AppCompatActivity implements Validator.ValidationListener {

    @NotEmpty
    @Length(min = 8,message = "Enter full name")
    private EditText edtUserName;
    @NotEmpty
    @Email(message = "Invalid or Used Email")
    private EditText edtEmail;
    @NotEmpty
    @Password(min = 8, scheme = Password.Scheme.ANY,message = "one upper,lower and symbol char one digit and at least 8")
    private EditText edtPass;
    @NotEmpty
    @Min(value = 16,message = "+16 only")
    private EditText edtAge;

    private String sUserName, sEmail, sPass, sSex = "";
    private Integer iAge;
    private Button btnMaleSignUp, btnFemaleSignUp;
    private Validator validator;
    private List userList = new LinkedList();
    private Integer res = 0;
    private boolean clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edtUserName = (EditText) findViewById(R.id.Name);
        edtEmail = (EditText) findViewById(R.id.mail_reg);
        edtPass = (EditText) findViewById(R.id.Password);
        edtAge = (EditText) findViewById(R.id.Age);

        btnMaleSignUp = (Button) findViewById(R.id.Male);
        btnFemaleSignUp = (Button) findViewById(R.id.Female);

        validator = new Validator(this);
        validator.setValidationListener(this);

        btnMaleSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sSex = "male";
                validator.validate();
                checkUser();
            }
        });

        btnFemaleSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sSex = "female";
                validator.validate();
                checkUser();
            }
        });
    }

    public boolean checkUser() {
        sUserName = String.valueOf(edtUserName.getText());
        sEmail = String.valueOf(edtEmail.getText());
        sPass = String.valueOf(edtPass.getText());
        iAge = Integer.parseInt(String.valueOf(edtAge.getText()));

        boolean found = false;
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        UserDAO userDAO = new UserDAOImpl(helper);

        SelectQuery selectQuery = new SelectQuery(UserDAO.TABLE_EXPRESSION);
        selectQuery.setColumnExpression(AExp.fun("count", UserDAO.ID)).where(UserDAO.EMAIL.eq(sEmail));
        res = userDAO.select(selectQuery, new IntegerResultSetHandler()).getObjectList().get(0);
        if (res >= 1) {
            found = true;
            showError();
        }else {
            found = false;
        }
        return found;
    }

    private void sendData(){
        User user = new User();
        user.setName(sUserName);
        user.setEmail(sEmail);
        user.setAge(iAge);
        user.setHeight(null);
        user.setWeight(null);
        user.setPassword(sPass);
        user.setGender(sSex);
        user.setGoal(null);
        user.setActivitylevelId(null);

        Intent i = new Intent(Sign_up.this, Sign_up_2.class);
        i.putExtra("MyClass", user);
        startActivity(i);
    }

    private void showError() {
        edtEmail.setError("Invalid or used Email");
    }

    @Override
    public void onValidationSucceeded() {
        if(!checkUser()) {
            Toast.makeText(this, "Yay! we got it right!"+sSex, Toast.LENGTH_SHORT).show();
            sendData();
        }else{
            showError();
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
}
