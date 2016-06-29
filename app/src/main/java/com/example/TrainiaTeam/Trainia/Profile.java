package com.example.TrainiaTeam.Trainia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

import TrainiaDB.gen.User;
import TrainiaDB.gen.UserDAO;
import TrainiaDB.gen.UserDAOImpl;
import TrainiaDB.gen.Workouts;
import TrainiaDB.gen.WorkoutsDAO;
import TrainiaDB.gen.WorkoutsDAOImpl;
import TrainiaDB.runtime.util.SimpleSQLiteOpenHelper;

public class Profile extends AppCompatActivity {

    private static final int Time_RunTime = 10000;
    private TextView tvName,tvWeight,tvHeight;
    private boolean mbAtcive;
    private ProgressBar mProgressBar;
    private ImageButton btnPushup,btnSquat,btnPullup,btnSitup;
    private Button btnLogOut;
    private SessionManager manager;
    private List Workouts = new LinkedList();
    private Workouts workout;
    private List Users = new LinkedList();
    private User user;
    private Integer selectedWorkoutId,userId,pushupSelectedlevelId = 0,pullupSelectedlevelId,situpSelectedlevelId,squatSelectedlevelId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mProgressBar = (ProgressBar)findViewById(R.id.progressBar1);
        btnPushup = (ImageButton) findViewById(R.id.imageButton3);
        btnSquat = (ImageButton) findViewById(R.id.imageButton5);
        btnPullup = (ImageButton) findViewById(R.id.imageButton4);
        btnSitup = (ImageButton) findViewById(R.id.imageButton6);
        tvName = (TextView) findViewById(R.id.P_Name);
        tvWeight = (TextView) findViewById(R.id.W_kg);
        tvHeight = (TextView) findViewById(R.id.H_Cm);

        btnLogOut = (Button) findViewById(R.id.logOut);

        manager = new SessionManager();
        userId = Integer.valueOf(manager.getPreferences(Profile.this,"id"));
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(Profile.this);
        UserDAO userDAO = new UserDAOImpl(helper);
        Users = userDAO.getUserList(userDAO.ID.eq(userId));
        user = (User) Users.get(0);

        tvName.setText(user.getName());
        tvWeight.setText(String.valueOf(user.getWeight()));
        tvHeight.setText(String.valueOf(user.getHeight()));


        btnPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manager.getPreferences(Profile.this, "pushupSelectedLevelId").equalsIgnoreCase("")) {
                    pushupSelectedlevelId = 0;
                }else{
                        pushupSelectedlevelId = Integer.valueOf(manager.getPreferences(Profile.this, "pushupSelectedLevelId"));
                    }
                SimpleSQLiteOpenHelper helper = new DatabaseHelper(Profile.this);
                WorkoutsDAO workoutsDAO = new WorkoutsDAOImpl(helper);
                Workouts = workoutsDAO.getWorkoutsList(workoutsDAO.WORKOUT_NAME.eq("Push up"));
                workout = (Workouts) Workouts.get(0);
                selectedWorkoutId = workout.getId();
                manager.setPreferences(Profile.this,"selectedWorkoutId",String.valueOf(selectedWorkoutId));
                Toast.makeText(getApplicationContext(), "pushup Clicked"+selectedWorkoutId, Toast.LENGTH_SHORT).show();
                if(pushupSelectedlevelId == 0) {
                    startActivity(new Intent((Profile.this), LevelActivty.class));
                }else{
                    startActivity(new Intent((Profile.this), Push_up.class));
                }
            }
        });
        btnSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manager.getPreferences(Profile.this, "squatSelectedLevelId").equalsIgnoreCase("")) {
                    squatSelectedlevelId = 0;
                }else{
                    squatSelectedlevelId = Integer.valueOf(manager.getPreferences(Profile.this, "squatSelectedLevelId"));
                }
                SimpleSQLiteOpenHelper helper = new DatabaseHelper(Profile.this);
                WorkoutsDAO workoutsDAO = new WorkoutsDAOImpl(helper);
                Workouts = workoutsDAO.getWorkoutsList(workoutsDAO.WORKOUT_NAME.eq("Squat"));
                workout = (Workouts) Workouts.get(0);
                selectedWorkoutId = workout.getId();
                manager.setPreferences(Profile.this,"selectedWorkoutId",String.valueOf(selectedWorkoutId));
                Toast.makeText(getApplicationContext(), "Squat Clicked"+selectedWorkoutId, Toast.LENGTH_SHORT).show();
                if(squatSelectedlevelId == 0) {
                    startActivity(new Intent((Profile.this), LevelActivty.class));
                }else{
                    startActivity(new Intent((Profile.this), Squat.class));
                }
            }
        });
        btnPullup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manager.getPreferences(Profile.this, "PullupSelectedLevelId").equalsIgnoreCase("")) {
                    pullupSelectedlevelId = 0;
                }else{
                    pullupSelectedlevelId = Integer.valueOf(manager.getPreferences(Profile.this, "PullupSelectedLevelId"));
                }
                SimpleSQLiteOpenHelper helper = new DatabaseHelper(Profile.this);
                WorkoutsDAO workoutsDAO = new WorkoutsDAOImpl(helper);
                Workouts = workoutsDAO.getWorkoutsList(workoutsDAO.WORKOUT_NAME.eq("Pull up"));
                workout = (Workouts) Workouts.get(0);
                selectedWorkoutId = workout.getId();
                manager.setPreferences(Profile.this,"selectedWorkoutId",String.valueOf(selectedWorkoutId));
                Toast.makeText(getApplicationContext(), "pullup Clicked"+selectedWorkoutId, Toast.LENGTH_SHORT).show();
                if(pullupSelectedlevelId == 0) {
                    startActivity(new Intent((Profile.this), LevelActivty.class));
                }else{
                    startActivity(new Intent((Profile.this), Pull_up.class));
                }
            }
        });
        btnSitup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manager.getPreferences(Profile.this, "situpSelectedLevelId").equalsIgnoreCase("")) {
                    situpSelectedlevelId = 0;
                }else{
                    situpSelectedlevelId = Integer.valueOf(manager.getPreferences(Profile.this, "situpSelectedLevelId"));
                }
                SimpleSQLiteOpenHelper helper = new DatabaseHelper(Profile.this);
                WorkoutsDAO workoutsDAO = new WorkoutsDAOImpl(helper);
                Workouts = workoutsDAO.getWorkoutsList(workoutsDAO.WORKOUT_NAME.eq("Sit up"));
                workout = (Workouts) Workouts.get(0);
                selectedWorkoutId = workout.getId();
                manager.setPreferences(Profile.this,"selectedWorkoutId",String.valueOf(selectedWorkoutId));
                Toast.makeText(getApplicationContext(), "Sit up Clicked"+selectedWorkoutId, Toast.LENGTH_SHORT).show();
                if(situpSelectedlevelId == 0) {
                    startActivity(new Intent((Profile.this), LevelActivty.class));
                }else{
                    startActivity(new Intent((Profile.this), Sit_up.class));
                }
            }
        });

        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.setPreferences(Profile.this, "status", "0");
                finish();
            }
        });

        final Thread timerThread = new Thread()
        {
            @Override
        public void run (){
                mbAtcive =true;
                try{
                    int watied =0;
                    while (mbAtcive && (watied < Time_RunTime)){
                        sleep(200);
                        if (mbAtcive){
                            watied +=200;
                            updateProgress(watied);
                        }

                    }
                }catch (InterruptedException e){
                    //case Error
                }finally {
                    onContinue();
                }
            }


        };
        timerThread.start();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        /*finish();
        System.exit(0);*/
    }

    public void updateProgress (final int timePassed){
        if (null != mProgressBar){
            final int progress = mProgressBar.getMax() * timePassed / Time_RunTime;
            mProgressBar.setProgress(progress);
        }
    }


    public void onContinue (){
        Log.d("messagefinal", "loading progress finish  !!");
    }


}
