package com.example.TrainiaTeam.Trainia;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.lang.Long;
import java.util.Locale;

import TrainiaDB.gen.Log;
import TrainiaDB.gen.LogDAO;
import TrainiaDB.gen.LogDAOImpl;
import TrainiaDB.gen.Progressdetails;
import TrainiaDB.gen.ProgressdetailsDAO;
import TrainiaDB.gen.ProgressdetailsDAOImpl;
import TrainiaDB.gen.Sets;
import TrainiaDB.gen.SetsDAO;
import TrainiaDB.gen.SetsDAOImpl;
import TrainiaDB.gen.User;
import TrainiaDB.gen.UserDAO;
import TrainiaDB.gen.UserDAOImpl;
import TrainiaDB.runtime.util.SimpleSQLiteOpenHelper;


public class Progress_Squat extends AppCompatActivity implements SensorEventListener, TextToSpeech.OnInitListener{

    private TextView tvSets,tvSet,tvTotalsetsReps,tvRest,tvTxtPushups,tvTxtToGo,tvSet2;
    private Integer iTotalsetsReps = 0,iSplittedSet,iReps = 0,iWorkoutId,iSetsid,iScore,iUserId,iLevelId,iCalorie;
    private SensorManager mSensorManager;
    private long Time1,Time2 = 0l;
    private List setsList = new LinkedList(),Users = new LinkedList();
    private Sets sets;
    private String sSetsReps,sSetsSum,sGender;
    private String [] splittedSets;

    private int i=0,millis = 3000,cdInterval = 1000,minutes = ((millis/60)/1000),secondes;
    private CountDown cd1;
    private Toast mes;
    private Animation in,out;

    private SoundPool soundPool;
    private int soundID;
    private AudioManager audioManager;
    private int MY_DATA_CHECK_CODE = 0;
    private TextToSpeech myTTS;
    private float maxVolume;

    private Progressdetails progressdetails;
    private Date dDailyDate,dCompletionDate;

    private SessionManager manager;
    private User user;

    private List logList = new LinkedList();
    private Log log;

    private ArrayList<Float> mean = new ArrayList<Float>();
    private ArrayList<Long> timemean = new ArrayList<Long>();
    private Sensor accelerometer;
    private long starttime, finishtime,elapsedtime;
    private int ii = 0;
    private int timeresultcounter = 0;
    private boolean minflag = false, maxflag = false;
    private List<Long> timelist = new ArrayList<Long>();
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress__squat);

        tvSets = (TextView) findViewById(R.id.sets_txt);
        tvSet = (TextView) findViewById(R.id.sets_No);
        tvSet2 = (TextView) findViewById(R.id.sets_No2);
        tvTotalsetsReps = (TextView) findViewById(R.id.txt_full_sets);
        tvRest = (TextView) findViewById(R.id.rest);
        tvTxtPushups = (TextView) findViewById(R.id.txt_push_ups);
        tvTxtToGo = (TextView) findViewById(R.id.txt_togo);

        manager = new SessionManager();
        mSensorManager   = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorManager.registerListener(Progress_Squat.this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);

        iWorkoutId = Integer.valueOf(manager.getPreferences(Progress_Squat.this,"selectedWorkoutId"));
        iLevelId = Integer.valueOf(manager.getPreferences(Progress_Squat.this, "squatSelectedLevelId"));
        iUserId = Integer.valueOf(manager.getPreferences(Progress_Squat.this,"id"));

        setRestTime();

        cd1 =  new CountDown(millis, cdInterval);

        out = AnimationUtils.makeOutAnimation(this, true);
        in = AnimationUtils.makeInAnimation(this, true);

        getSets();

        tvSet.setText(String.valueOf(splittedSets[0]));
        tvSet2.setText("0");

        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundID = soundPool.load(this, R.raw.ding, 1);
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        maxVolume = (float) audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);

        Intent checkTTSIntent = new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);

    }

    @Override
    protected void onDestroy() {
        myTTS.stop();
        myTTS.shutdown();
        super.onDestroy();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        mean.add(event.values[1]);
        timemean.add(event.timestamp);
        iSplittedSet = Integer.valueOf(splittedSets[i]);
            tvSet.setVisibility(View.INVISIBLE);
            tvSet2.setVisibility(View.VISIBLE);
            tvTxtPushups.setVisibility(View.INVISIBLE);
            tvTxtToGo.setVisibility(View.INVISIBLE);

        if (mean.size() >= 3) {

            while (maxflag == false && ii + 2 != mean.size() && ii + 2 < mean.size() ) {
                if (mean.get(ii) >= 12.5 && mean.get(ii - 1) < 12.5 && mean.get(ii - 1) != 12.5) {
                    starttime = System.nanoTime();
                    if(timeresultcounter != 0)
                    {
                        timeresultcounter++;
                    }
                    maxflag = true;

                }
                ii++;
            }


            counter = ii;
            if (ii + 5 != mean.size() && ii + 6 < mean.size()) {
                if (maxflag) {
                    while (minflag == false && ii <= counter + 4) {
                        if (mean.get(ii) < 8.4) {
                            finishtime = System.nanoTime();
                            elapsedtime = finishtime - starttime;
                            timelist.add(elapsedtime);
                            minflag = true;

                        }
                        ii++;
                    }
                }
            }
            else {
                minflag = false;
            }
            if (minflag && maxflag) {
                if (elapsedtime >= 999899999) {
                    soundPool.play(soundID, maxVolume, maxVolume, 1, 0, 1f);
                    iReps++;
                }


                minflag = false;
                maxflag = false;
                ii = ii - 1;
            }

            if(i == splittedSets.length-1 && iReps == iSplittedSet){
                tvSet.setVisibility(View.VISIBLE);
                tvRest.setVisibility(View.INVISIBLE);
                tvSet2.setVisibility(View.INVISIBLE);
                tvSet.startAnimation(in);
                tvSet.setText("Done");
                speakWords("Congratulations You did it");
                speakWordsAdd("We'll get your body in shape");
                mSensorManager.unregisterListener(this);
                progressdetails = saveUserProgress();
//                workoutstate = saveUserWorkoutState();
                log = saveUserLog();
                Toast.makeText(this, "user saved"+progressdetails.getCalorie()+log.getSumcalorie(), Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(),BarCharGraphActivity.class));
            }
            if(iReps == iSplittedSet && i < splittedSets.length-1){
                mSensorManager.unregisterListener(this);
                tvSet2.startAnimation(out);
                tvSet2.setVisibility(View.INVISIBLE);
                tvRest.startAnimation(in);
                tvRest.setVisibility(View.VISIBLE);
                speakWords("Rest Now");
                cd1.start();
                i+=1;
            }
            tvSet2.setText(""+iReps);
        }
    }

    protected void onResume() {
        super.onResume();
        iReps = 0;
        mSensorManager.registerListener(this, accelerometer,
                SensorManager.SENSOR_DELAY_NORMAL);
    }
    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onInit(int initStatus) {
        if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE) myTTS.setLanguage(Locale.US);
        if (initStatus == TextToSpeech.SUCCESS) {
            myTTS.setLanguage(Locale.US);
        }
        else if (initStatus == TextToSpeech.ERROR) {
            Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }

    public class CountDown extends CountDownTimer {

        public CountDown(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {
            secondes-=1;
            tvRest.setText(""+minutes+":"+secondes+"");
            if(minutes == 0 && secondes == 0){
                tvRest.setText("0:0");
            }
        }

        @Override
        public void onFinish() {
            secondes=millis/1000;
            if(i == splittedSets.length){
                i = 0;
                tvSet2.setText("Done");
                mSensorManager.unregisterListener(Progress_Squat.this);
                mes.makeText(Progress_Squat.this,"end of sets",Toast.LENGTH_SHORT).show();
            }
            else {

                iReps = 0;
                tvSet.setText(String.valueOf(Integer.parseInt(splittedSets[i])));

                tvRest.setVisibility(View.INVISIBLE);
                tvSet.setVisibility(View.VISIBLE);
                tvTxtPushups.setVisibility(View.VISIBLE);
                tvTxtToGo.setVisibility(View.VISIBLE);
                tvSet2.setVisibility(View.INVISIBLE);
                mSensorManager.registerListener(Progress_Squat.this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
            }
        }
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == MY_DATA_CHECK_CODE) {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                myTTS = new TextToSpeech(Progress_Squat.this, this);
            }
            else {
                Intent installTTSIntent = new Intent();
                installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                startActivity(installTTSIntent);
            }
        }
    }
    private void speakWords(String speech) {
//implement TTS here
        myTTS.speak(speech, TextToSpeech.QUEUE_FLUSH, null);

    }
    private void speakWordsAdd(String speech) {
//implement TTS here
        myTTS.speak(speech, TextToSpeech.QUEUE_ADD, null);

    }
    private void getSets(){
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        SetsDAO setsDAO = new SetsDAOImpl(helper);
        setsList = setsDAO.getSetsList(setsDAO.WORKOUTS_ID.eq(iWorkoutId).and(setsDAO.LEVEL_ID.eq(iLevelId)));
        sets= (Sets) setsList.get(0);
        sSetsReps =sets.getSets();
        iTotalsetsReps = sets.getSetssum();
        sSetsSum = String.valueOf(iTotalsetsReps);
        tvSets.setText(String.valueOf(sSetsReps));
        tvTotalsetsReps.setText(sSetsSum);
        splittedSets = sSetsReps.split("-");
        helper.close();
    }

    private User getUser(){
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        UserDAO userDAO = new UserDAOImpl(helper);
        Users = userDAO.getUserList(userDAO.ID.eq(iUserId));
        user = (User) Users.get(0);
        helper.close();
        return user;
    }

    private Integer calculateButrntCAlories(){

        user = getUser();
        float w = user.getWeight();
        float h = user.getHeight();
        int a = user.getAge(),iCalorie = 0;
        sGender = user.getGender();
        float Mifflin;

        if(sGender.equalsIgnoreCase("male")){
            Mifflin = (float) ((9.99*w)+ (6.25*h)-(4.92*a )+ 5);
            iCalorie = (int) ((Mifflin*2*8*w*2*0.175)/(24*60*60));
        }else if(sGender.equalsIgnoreCase("female")){
            Mifflin = (float) ((9.99*w)+ (6.25*h)-(4.92*a )- 161);
            iCalorie = (int) ((Mifflin*2*8*w*2*0.175)/(24*60*60));
        }
        return iCalorie;
    }

    private Progressdetails saveUserProgress(){
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        ProgressdetailsDAO progressdetailsDAO = new ProgressdetailsDAOImpl(helper);
        dDailyDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        iScore = Integer.valueOf(sSetsSum);
        iSetsid = sets.getId();
        iCalorie = calculateButrntCAlories();
        progressdetails = new Progressdetails(null,iWorkoutId,iSetsid,iScore,iCalorie,iUserId,iLevelId,dDailyDate);
        progressdetailsDAO.insert(progressdetails);
        helper.close();
        return progressdetails;
    }

    private Log saveUserLog(){
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        LogDAO logDAO = new LogDAOImpl(helper);
        log = new Log(null,user.getId(),iWorkoutId,iScore,iCalorie,iLevelId,dDailyDate);//replace dailydate with completiondate

        logList = logDAO.getLogList(logDAO.TRAINEE_ID.eq(user.getId()).and(logDAO.WORKOUTS_ID.eq(iWorkoutId))
                .and(logDAO.LEVEL_ID.eq(iLevelId)));
        if(logList.size() == 0){
            logDAO.insert(log);
        }else{
            log = (Log) logList.get(0);
            log.setSumscore(log.getSumscore()+iScore);
            log.setSumcalorie (log.getSumcalorie()+iCalorie);
            logDAO.update(log);
        }
        helper.close();
        return log;
    }
    private void setRestTime(){
        if(iLevelId == 1){
            millis = 30000;
        }else if(iLevelId == 2){
            millis = 60000;
        }else if(iLevelId == 3){
            millis = 0000;
        }

        secondes = millis/1000;
    }

}
