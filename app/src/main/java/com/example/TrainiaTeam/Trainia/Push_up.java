package com.example.TrainiaTeam.Trainia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

import TrainiaDB.gen.LogDAO;
import TrainiaDB.gen.LogDAOImpl;
import TrainiaDB.gen.Progressdetails;
import TrainiaDB.gen.ProgressdetailsDAO;
import TrainiaDB.gen.ProgressdetailsDAOImpl;
import TrainiaDB.gen.Sets;
import TrainiaDB.gen.SetsDAO;
import TrainiaDB.gen.SetsDAOImpl;
import TrainiaDB.gen.Setsum;
import TrainiaDB.gen.SetsumDAO;
import TrainiaDB.gen.SetsumDAOImpl;
import TrainiaDB.gen.Workoutlevel;
import TrainiaDB.gen.WorkoutlevelDAO;
import TrainiaDB.gen.WorkoutlevelDAOImpl;
import TrainiaDB.runtime.util.SimpleSQLiteOpenHelper;

public class Push_up extends AppCompatActivity {
   protected static final int Time_RunTime = 10000;
    protected boolean mbAtcive;
    protected ProgressBar mProgressBar;
    private ProgressBar donutProgress;
    private SessionManager manager;
    private Integer ilevelId,iworkoutId,isetSum,iSumScore;
    private List setSumList = new LinkedList();
    private List progressList = new LinkedList();

    private Setsum setSum;
    private Progressdetails progressdetails;
    private int progressCount,levelDays;

    private List logList = new LinkedList();
    private List setsList = new LinkedList();
    private List workoutLevlList = new LinkedList();


    private  TextView setTv;
    private  int finshedDays;
    private TrainiaDB.gen.Sets sets;
    private String setsResp;


    private TrainiaDB.gen.Log log;
    private TrainiaDB.gen.Workoutlevel workoutlevel;

    private TextView tvTotalReps;

    private ImageButton btnSubmit,btnStatistics;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Push_up.this,Profile.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_ups);

        mProgressBar = (ProgressBar)findViewById(R.id.progressBar1);
        donutProgress = (ProgressBar) findViewById(R.id.donut_progress);
        tvTotalReps = (TextView) findViewById(R.id.reps);
        setTv = (TextView) findViewById(R.id.textView6);
        btnSubmit = (ImageButton) findViewById(R.id.imageView8);
        btnStatistics = (ImageButton) findViewById(R.id.imageView9);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent((Push_up.this),Progress_Push_Up.class));
            }
        });

        btnStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent((Push_up.this),BarCharGraphActivity.class));
            }
        });

        manager = new SessionManager();
        ilevelId = Integer.valueOf(manager.getPreferences(Push_up.this,"pushupSelectedLevelId"));
        iworkoutId = Integer.valueOf(manager.getPreferences(Push_up.this,"selectedWorkoutId"));

        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        SetsumDAO setSumDAO = new SetsumDAOImpl(helper);
        setSumList = setSumDAO.getSetsumList(setSumDAO.LEVEL_ID.eq(ilevelId).and(setSumDAO.WORKOUTS_ID.eq(iworkoutId)));
        setSum = (Setsum) setSumList.get(0);
        isetSum= setSum.getSetsum();
        tvTotalReps.setText(String.valueOf(isetSum));

        LogDAO logDAO = new LogDAOImpl(helper);
        logList = logDAO.getLogList(logDAO.TRAINEE_ID.eq(1).and(logDAO.WORKOUTS_ID.eq(1)).and(logDAO.LEVEL_ID.eq(1)));


        SetsDAO setsDAO = new SetsDAOImpl(helper);
        setsList = setsDAO.getSetsList(setsDAO.WORKOUTS_ID.eq(1).and(setsDAO.LEVEL_ID.eq(1)));
        sets= (Sets) setsList.get(0);
        setsResp=sets.getSets();
        setTv.setText(String.valueOf(setsResp));

        ProgressdetailsDAO ProgressdetailsDAO = new ProgressdetailsDAOImpl(helper);
        progressList = ProgressdetailsDAO.getProgressdetailsList(ProgressdetailsDAO.LEVEL_ID.eq(1).and(ProgressdetailsDAO.WORKOUTS_ID
                .eq(1).and(ProgressdetailsDAO.USER_ID.eq(1))));


        WorkoutlevelDAO WorkoutlevelDAO = new WorkoutlevelDAOImpl(helper);
        workoutLevlList = WorkoutlevelDAO.getWorkoutlevelList(WorkoutlevelDAO.LEVEL_ID.eq(1).and(WorkoutlevelDAO.WORKOUT_ID.eq(1)));
        workoutlevel= (Workoutlevel) workoutLevlList.get(0);

        levelDays=workoutlevel.getDays();

        tvTotalReps.setText(String.valueOf(isetSum));




        if(logList.isEmpty()){
            iSumScore = 0;
        }else {
            log = (TrainiaDB.gen.Log) logList.get(0);
            iSumScore = log.getSumscore();
        }

        if(progressList.isEmpty()){
            progressCount = 0;
        }else {
            progressCount=progressList.size();

        }

        donutProgress.setProgress(iSumScore*100/isetSum);






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

    public void updateProgress (final int timePassed){
        if (null != mProgressBar){
            final int progress = mProgressBar.getMax() * progressCount / levelDays;
            mProgressBar.setProgress(progress);
        }
    }


    public void onContinue (){
        Log.d("messagefinall", "loading progress finish !!!!!!");
    }
}
