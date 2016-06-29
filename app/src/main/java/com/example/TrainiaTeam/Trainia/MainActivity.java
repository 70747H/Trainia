package com.example.TrainiaTeam.Trainia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import TrainiaDB.gen.Activitylevel;
import TrainiaDB.gen.ActivitylevelDAO;
import TrainiaDB.gen.ActivitylevelDAOImpl;
import TrainiaDB.gen.Level;
import TrainiaDB.gen.LevelDAO;
import TrainiaDB.gen.LevelDAOImpl;
import TrainiaDB.gen.Progressdetails;
import TrainiaDB.gen.ProgressdetailsDAO;
import TrainiaDB.gen.ProgressdetailsDAOImpl;
import TrainiaDB.gen.Schedule;
import TrainiaDB.gen.ScheduleDAO;
import TrainiaDB.gen.ScheduleDAOImpl;
import TrainiaDB.gen.Sets;
import TrainiaDB.gen.SetsDAO;
import TrainiaDB.gen.SetsDAOImpl;
import TrainiaDB.gen.Setsum;
import TrainiaDB.gen.SetsumDAO;
import TrainiaDB.gen.SetsumDAOImpl;
import TrainiaDB.gen.Workoutlevel;
import TrainiaDB.gen.WorkoutlevelDAO;
import TrainiaDB.gen.WorkoutlevelDAOImpl;
import TrainiaDB.gen.Workouts;
import TrainiaDB.gen.WorkoutsDAO;
import TrainiaDB.gen.WorkoutsDAOImpl;
import TrainiaDB.runtime.util.SimpleSQLiteOpenHelper;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    private List workoutList = new LinkedList();
    private List activityLevelList = new LinkedList();
    private List levelList = new LinkedList();
    private List setList = new LinkedList();
    private List setSumList = new LinkedList();
    private List worokoutlevelList = new LinkedList();
    private List progressDetailsList = new LinkedList();

    private List scheduleList = new LinkedList();
    private SessionManager manager;
    private String status;
    private Integer iBulkData = 0;

    java.sql.Date date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView3);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splash_loading);

        manager = new SessionManager();

        workoutsBulkInsertion();
        iBulkData = Integer.valueOf(manager.getPreferences(MainActivity.this,"bulkData"));

        if(iBulkData == 1){
            animation.setDuration(12000);

        }else{
            animation.setDuration(100);

        }

        imageView.setAnimation(animation);

//        finish();

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

                status=manager.getPreferences(MainActivity.this,"status");

                activityLevelBulkInsertion();
                levelBulkInsertion();
                setSumBulkInsertion();
                setsBulkInsertion();
                scheduleBulkInsertion();
                workoutLevelBulkInsertion();

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                finish();
                if (status.equals("1")){
                    Intent i=new Intent(MainActivity.this,Profile.class);
                    startActivity(i);
                }else{
                    Intent i=new Intent(MainActivity.this,Sign_In.class);
                    startActivity(i);
                }
//                startActivity(new Intent(getApplicationContext(),Sign_In.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void workoutsBulkInsertion() {

        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        WorkoutsDAO workoutsDAO = new WorkoutsDAOImpl(helper);
//        UserDAO userDAO = new UserDAOImpl(helper);

        Workouts workout1 = new Workouts(1, "Push up");
        Workouts workout2 = new Workouts(2, "Pull up");
        Workouts workout3 = new Workouts(3, "Sit up");
        Workouts workout4 = new Workouts(4, "Squat");
        Workouts workout5 = new Workouts(5, "Dips");
//        User user = new User(null,"Hussien","Mahdy","hussien@",21,"123","male",173f,70f,"gain",1);

        workoutList.clear();
        workoutList.addAll(workoutsDAO.getWorkoutsList());

        if(workoutList.isEmpty()){
            workoutsDAO.insert(workout1);
            workoutsDAO.insert(workout2);
            workoutsDAO.insert(workout3);
            workoutsDAO.insert(workout4);
            workoutsDAO.insert(workout5);
//            userDAO.insert(user);
            manager.setPreferences(MainActivity.this,"bulkData","1");
            Toast.makeText(getApplicationContext(),"Workouts Successeded", Toast.LENGTH_SHORT).show();
        }else{
            manager.setPreferences(MainActivity.this,"bulkData","0");
        }
    }

    public void activityLevelBulkInsertion(){
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        ActivitylevelDAO activitylevelDAO = new ActivitylevelDAOImpl(helper);

        Activitylevel activitylevel1 = new Activitylevel(1, "Sedentry",1.2f,"little or no exercise");
        Activitylevel activitylevel2 = new Activitylevel(2, "Lightly Active",1.375f, "exercise 1-3 times/week");
        Activitylevel activitylevel3 = new Activitylevel(3, "Moderately Active",1.55f,"exercise 3-5 times/week");
        Activitylevel activitylevel4 = new Activitylevel(4, "Very Active",1.725f,"exercise 6-7 times/week");
        Activitylevel activitylevel5 = new Activitylevel(5, "Extra Active",1.9f,"very hard exercise or physical job");

        activityLevelList.clear();
        activityLevelList.addAll(activitylevelDAO.getActivitylevelList());

        if (activityLevelList.isEmpty()) {
            activitylevelDAO.insert(activitylevel1);
            activitylevelDAO.insert(activitylevel2);
            activitylevelDAO.insert(activitylevel3);
            activitylevelDAO.insert(activitylevel4);
            activitylevelDAO.insert(activitylevel5);
            Toast.makeText(getApplicationContext(),"ActivityLevel Successeded", Toast.LENGTH_SHORT).show();
        }
    }

    public void levelBulkInsertion(){
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        LevelDAO levelDAO = new LevelDAOImpl(helper);

        Level level1 = new Level(1,"beginner");
        Level level2 = new Level(2,"intermediate");
        Level level3 = new Level(3,"advanced");

        levelList.clear();
        levelList.addAll(levelDAO.getLevelList());

        if (levelList.isEmpty()) {
            levelDAO.insert(level1);
            levelDAO.insert(level2);
            levelDAO.insert(level3);
            Toast.makeText(getApplicationContext(),"Level Successeded", Toast.LENGTH_SHORT).show();
        }
    }

    public void setSumBulkInsertion(){
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        SetsumDAO setSumDAO = new SetsumDAOImpl(helper);

        Setsum setSum1 = new Setsum(null,1,1,299);
        Setsum setSum2 = new Setsum(null,1,2,1641);
        Setsum setSum3 = new Setsum(null,1,3,3586);
        Setsum setSum4 = new Setsum(null,2,1,231);
        Setsum setSum5 = new Setsum(null,2,2,589);
        Setsum setSum6 = new Setsum(null,2,3,924);
        Setsum setSum7 = new Setsum(null,3,1,272);
        Setsum setSum8 = new Setsum(null,3,2,2060);
        Setsum setSum9 = new Setsum(null,3,3,3620);
        Setsum setSum10 = new Setsum(null,4,1,229);
        Setsum setSum11 = new Setsum(null,4,2,2307);
        Setsum setSum12 = new Setsum(null,4,3,4278);
        Setsum setSum13 = new Setsum(null,5,1,231);
        Setsum setSum14 = new Setsum(null,5,2,589);
        Setsum setSum15 = new Setsum(null,5,3,924);

        setSumList.clear();
        setSumList.addAll(setSumDAO.getSetsumList());

        if (setSumList.isEmpty()) {
            setSumDAO.insert(setSum1);
            setSumDAO.insert(setSum2);
            setSumDAO.insert(setSum3);
            setSumDAO.insert(setSum4);
            setSumDAO.insert(setSum5);
            setSumDAO.insert(setSum6);
            setSumDAO.insert(setSum7);
            setSumDAO.insert(setSum8);
            setSumDAO.insert(setSum9);
            setSumDAO.insert(setSum10);
            setSumDAO.insert(setSum11);
            setSumDAO.insert(setSum12);
            setSumDAO.insert(setSum13);
            setSumDAO.insert(setSum14);
            setSumDAO.insert(setSum15);
            Toast.makeText(getApplicationContext(),"SetSum Successeded", Toast.LENGTH_SHORT).show();
        }
    }

    public void scheduleBulkInsertion(){
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        ScheduleDAO scheduleDAO = new ScheduleDAOImpl(helper);

        Schedule schedule1 = new Schedule(1,"4,1,1,1,3,1,1,1");
        Schedule schedule2 = new Schedule(2,"2,1,2,2");
        Schedule schedule3 = new Schedule(3,"1,1,1,1,1,2");


        scheduleList.clear();
        scheduleList.addAll(scheduleDAO.getScheduleList());

        if (scheduleList.isEmpty()) {
            scheduleDAO.insert(schedule1);
            scheduleDAO.insert(schedule2);
            scheduleDAO.insert(schedule3);
            Toast.makeText(getApplicationContext(),"Schedule S" +
                    "uccesseded", Toast.LENGTH_SHORT).show();
        }
    }

    public void workoutLevelBulkInsertion() {

        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        WorkoutlevelDAO workoutlevelDAO = new WorkoutlevelDAOImpl(helper);

        //id,iReps,days,workoutid,levelid,scheduleid
        Workoutlevel workoutlevel1 = new Workoutlevel(1,"5-10",10,1,1,1);
        Workoutlevel workoutlevel2 = new Workoutlevel(2,"15-25",19,1,2,3);
        Workoutlevel workoutlevel3 = new Workoutlevel(3,"35-50",25,1,3,3);
        Workoutlevel workoutlevel4 = new Workoutlevel(4,"2-5",19,2,1,3);
        Workoutlevel workoutlevel5 = new Workoutlevel(5,"10-15",19,2,2,3);
        Workoutlevel workoutlevel6 = new Workoutlevel(6,"20-25",19,2,3,3);
        Workoutlevel workoutlevel7 = new Workoutlevel(7,"3-8",9,3,1,2);
        Workoutlevel workoutlevel8 = new Workoutlevel(8,"12-20",19,3,2,3);
        Workoutlevel workoutlevel9 = new Workoutlevel(9,"30-40",19,3,3,3);
        Workoutlevel workoutlevel10 = new Workoutlevel(10,"5-10 ",10,4,1,2);
        Workoutlevel workoutlevel11 = new Workoutlevel(11,"35-50",10,4,2,3);
        Workoutlevel workoutlevel12 = new Workoutlevel(12,"60-100",10,4,3,3);
        Workoutlevel workoutlevel13 = new Workoutlevel(13,"2-5",19,5,1,3);
        Workoutlevel workoutlevel14 = new Workoutlevel(14,"10-15",19,5,2,3);
        Workoutlevel workoutlevel15 = new Workoutlevel(15,"20-25",19,5,3,3);

        worokoutlevelList.clear();
        worokoutlevelList.addAll(workoutlevelDAO.getWorkoutlevelList());

        if(worokoutlevelList.isEmpty()){
            workoutlevelDAO.insert(workoutlevel1);
            workoutlevelDAO.insert(workoutlevel2);
            workoutlevelDAO.insert(workoutlevel3);
            workoutlevelDAO.insert(workoutlevel4);
            workoutlevelDAO.insert(workoutlevel5);
            workoutlevelDAO.insert(workoutlevel6);
            workoutlevelDAO.insert(workoutlevel7);
            workoutlevelDAO.insert(workoutlevel8);
            workoutlevelDAO.insert(workoutlevel9);
            workoutlevelDAO.insert(workoutlevel10);
            workoutlevelDAO.insert(workoutlevel11);
            workoutlevelDAO.insert(workoutlevel12);
            workoutlevelDAO.insert(workoutlevel13);
            workoutlevelDAO.insert(workoutlevel14);
            workoutlevelDAO.insert(workoutlevel15);

            Toast.makeText(getApplicationContext(),"WorkoutLevel Successeded", Toast.LENGTH_SHORT).show();
        }
    }

    public void setsBulkInsertion(){
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(this.getApplicationContext());
        SetsDAO setsDAO = new SetsDAOImpl(helper);

        //-----------pushuplevel1------------------------
        Sets sets1 = new Sets(null,1,1,"2-3-4-3-2",14);
        Sets sets2 = new Sets(null,1,1,"3-4-4-3-2",30);
        Sets sets3 = new Sets(null,1,1,"4-4-3-5-4",50);
        Sets sets4 = new Sets(null,1,1,"5-6-6-4-4",75);
        Sets sets5 = new Sets(null,1,1,"7-6-6-5-3",102);
        Sets sets6 = new Sets(null,1,1,"8-8-6-7-6",137);
        Sets sets7 = new Sets(null,1,1,"10-6-10-8-6",177);
        Sets sets8 = new Sets(null,1,1,"12-8-8-10-8",223);
        Sets sets9 = new Sets(null,1,1,"14-10-14-8-8",277);
        Sets sets10 = new Sets(null,1,1,"20",297);
        //-----------pushuplevel2------------------------
        Sets sets11 = new Sets(null,2,1,"16-12-14-10-10",62);
        Sets sets12 = new Sets(null,2,1,"16-12-14-10-10",127);
        Sets sets13 = new Sets(null,2,1,"18-16-12-12-10",195);
        Sets sets14 = new Sets(null,2,1,"20-16-14-12-12",269);
        Sets sets15 = new Sets(null,2,1,"22-12-18-12-12",345);
        Sets sets16 = new Sets(null,2,1,"24-20-16-12-8",425);
        Sets sets17 = new Sets(null,2,1,"26-20-14-12-10",507);
        Sets sets18 = new Sets(null,2,1,"28-22-14-12-10",593);
        Sets sets19 = new Sets(null,2,1,"28-22-14-12-12",681);
        Sets sets20 = new Sets(null,2,1,"30-20-20-10-10",771);
        Sets sets21 = new Sets(null,2,1,"32-20-18-10-12",863);
        Sets sets22 = new Sets(null,2,1,"32-22-18-14-10",959);
        Sets sets23 = new Sets(null,2,1,"34-18-20-16-12",1059);
        Sets sets24 = new Sets(null,2,1,"34-20-18-16-12",1159);
        Sets sets25 = new Sets(null,2,1,"36-22-16-16-14",1263);
        Sets sets26 = new Sets(null,2,1,"38-24-18-14-12",1369);
        Sets sets27 = new Sets(null,2,1,"38-22-16-20-12",1477);
        Sets sets28 = new Sets(null,2,1,"40-18-24-16-16",1591);
        Sets sets29 = new Sets(null,2,1,"50",1641);
        //-----------pushuplevel3------------------------
        Sets sets30 = new Sets(null,3,1,"34-24-22-20-18",118);
        Sets sets31 = new Sets(null,3,1,"36-26-22-22-14",238);
        Sets sets32 = new Sets(null,3,1,"38-26-22-22-14",360);
        Sets sets33 = new Sets(null,3,1,"40-26-24-18-16",484);
        Sets sets34 = new Sets(null,3,1,"40-28-24-18-16",610);
        Sets sets35 = new Sets(null,3,1,"42-24-22-22-18",738);
        Sets sets36 = new Sets(null,3,1,"46-26-24-20-16",870);
        Sets sets37 = new Sets(null,3,1,"46-26-24-20-18",1004);
        Sets sets38 = new Sets(null,3,1,"48-26-26-20-16",1140);
        Sets sets39 = new Sets(null,3,1,"50-28-24-20-18",1280);
        Sets sets40 = new Sets(null,3,1,"50-26-26-22-18",1422);
        Sets sets41 = new Sets(null,3,1,"52-26-26-22-18",1566);
        Sets sets42 = new Sets(null,3,1,"54-28-24-22-18",1712);
        Sets sets43 = new Sets(null,3,1,"56-28-24-22-18",1860);
        Sets sets44 = new Sets(null,3,1,"58-28-24-22-18",2010);
        Sets sets45 = new Sets(null,3,1,"60-26-24-24-20",2164);
        Sets sets46 = new Sets(null,3,1,"62-30-24-22-18",2320);
        Sets sets47 = new Sets(null,3,1,"64-30-24-20-20",2478);
        Sets sets48 = new Sets(null,3,1,"66-30-24-22-20",2640);
        Sets sets49 = new Sets(null,3,1,"68-30-24-22-20",2804);
        Sets sets50 = new Sets(null,3,1,"70-32-24-22-18",2970);
        Sets sets51 = new Sets(null,3,1,"74-32-28-18-18",3140);
        Sets sets52 = new Sets(null,3,1,"76-32-24-20-20",3312);
        Sets sets53 = new Sets(null,3,1,"78-32-26-20-18",3486);
        Sets sets54 = new Sets(null,3,1,"100",3586);
        //-----------pulluplevel1------------------------
        Sets sets55 = new Sets(null,1,2,"1-1-1-1",4);
        Sets sets56 = new Sets(null,1,2,"1-2-2-1",10);
        Sets sets57 = new Sets(null,1,2,"2-2-1-2",17);
        Sets sets58 = new Sets(null,1,2,"2-2-2-2",25);
        Sets sets59 = new Sets(null,1,2,"2-3-3-2",35);
        Sets sets60 = new Sets(null,1,2,"3-3-2-2",45);
        Sets sets61 = new Sets(null,1,2,"4-3-2-2",56);
        Sets sets62 = new Sets(null,1,2,"4-3-3-2",68);
        Sets sets63 = new Sets(null,1,2,"4-4-3-2",81);
        Sets sets64 = new Sets(null,1,2,"4-4-3-3",95);
        Sets sets65 = new Sets(null,1,2,"4-4-4-3",110);
        Sets sets66 = new Sets(null,1,2,"5-4-4-3",126);
        Sets sets67 = new Sets(null,1,2,"5-5-4-3",143);
        Sets sets68 = new Sets(null,1,2,"5-5-5-3",161);
        Sets sets69 = new Sets(null,1,2,"6-5-4-4",180);
        Sets sets70 = new Sets(null,1,2,"6-6-4-4",200);
        Sets sets71 = new Sets(null,1,2,"7-5-5-4",221);
        Sets sets72 = new Sets(null,1,2,"10",231);
        //-----------pulluplevel2------------------------
        Sets sets73 = new Sets(null,2,2,"6-4-3-4",17);
        Sets sets74 = new Sets(null,2,2,"6-4-3-4",34);
        Sets sets75 = new Sets(null,2,2,"8-5-3-4",54);
        Sets sets76 = new Sets(null,2,2,"8-5-4-4",75);
        Sets sets77 = new Sets(null,2,2,"9-6-4-4",98);
        Sets sets78 = new Sets(null,2,2,"9-6-4-4",121);
        Sets sets79 = new Sets(null,2,2,"10-6-4-6",147);
        Sets sets80 = new Sets(null,2,2,"10-8-6-6",177);
        Sets sets81 = new Sets(null,2,2,"12-8-6-6",209);
        Sets sets82 = new Sets(null,2,2,"12-8-6-6",241);
        Sets sets83 = new Sets(null,2,2,"13-10-6-6",276);
        Sets sets84 = new Sets(null,2,2,"13-10-8-6",313);
        Sets sets85 = new Sets(null,2,2,"14-10-8-7",352);
        Sets sets86 = new Sets(null,2,2,"14-11-8-7",392);
        Sets sets87 = new Sets(null,2,2,"15-11-8-7",433);
        Sets sets88 = new Sets(null,2,2,"15-11-10-8",477);
        Sets sets89 = new Sets(null,2,2,"16-12-10-8",523);
        Sets sets90 = new Sets(null,2,2,"16-12-10-8",569);
        Sets sets91 = new Sets(null,2,2,"20",589);
        //-----------pulluplevel3------------------------
        Sets sets92 = new Sets(null,3,2,"18-10-8-10",46);
        Sets sets93 = new Sets(null,3,2,"18-10-8-10",92);
        Sets sets94 = new Sets(null,3,2,"18-10-8-10",138);
        Sets sets95 = new Sets(null,3,2,"20-10-8-10",186);
        Sets sets96 = new Sets(null,3,2,"20-11-9-10",236);
        Sets sets97 = new Sets(null,3,2,"20-11-9-10",286);
        Sets sets98 = new Sets(null,3,2,"22-11-9-10",338);
        Sets sets99 = new Sets(null,3,2,"22-11-9-10",390);
        Sets sets100 = new Sets(null,3,2,"22-12-10-10",444);
        Sets sets101 = new Sets(null,3,2,"24-12-10-14",504);
        Sets sets102 = new Sets(null,3,2,"24-12-10-14",564);
        Sets sets103 = new Sets(null,3,2,"26-11-13-14",628);
        Sets sets104 = new Sets(null,3,2,"26-11-13-14",692);
        Sets sets105 = new Sets(null,3,2,"28-13-11-14",758);
        Sets sets106 = new Sets(null,3,2,"28-14-12-14",826);
        Sets sets107 = new Sets(null,3,2,"28-14-12-14",894);
        Sets sets108 = new Sets(null,3,2,"30",924);
        //-----------situplevel1------------------------
        Sets sets109 = new Sets(null,1,3,"2-3-3-2-3-2",15);
        Sets sets110 = new Sets(null,1,3,"3-2-3-3-2-2",30);
        Sets sets111 = new Sets(null,1,3,"4-4-3-3-2-2",48);
        Sets sets112 = new Sets(null,1,3,"6-5-4-3-2-2",70);
        Sets sets113 = new Sets(null,1,3,"10-8-6-4-4-4",106);
        Sets sets114 = new Sets(null,1,3,"12-10-6-6-4-4",148);
        Sets sets115 = new Sets(null,1,3,"14-10-8-6-6-4",196);
        Sets sets116 = new Sets(null,1,3,"16-12-8-8-6-6",252);
        Sets sets117 = new Sets(null,1,3,"20",272);
        //-----------situplevel2------------------------
        Sets sets118 = new Sets(null,2,3,"18-16-12-10-8-8",72);
        Sets sets119 = new Sets(null,2,3,"20-16-14-12-10-8",152);
        Sets sets120 = new Sets(null,2,3,"24-16-14-12-12-10",240);
        Sets sets121 = new Sets(null,2,3,"28-18-16-12-12-10",336);
        Sets sets122 = new Sets(null,2,3,"28-18-16-14-12-10",434);
        Sets sets123 = new Sets(null,2,3,"32-18-16-14-14-12",540);
        Sets sets124 = new Sets(null,2,3,"36-20-18-14-14-12",654);
        Sets sets125 = new Sets(null,2,3,"36-20-18-16-14-12",770);
        Sets sets126 = new Sets(null,2,3,"38-20-18-16-16-14",892);
        Sets sets127 = new Sets(null,2,3,"42-20-18-16-16-14",1018);
        Sets sets128 = new Sets(null,2,3,"42-22-20-16-16-14",1148);
        Sets sets129 = new Sets(null,2,3,"44-22-20-18-16-14",1282);
        Sets sets130 = new Sets(null,2,3,"44-22-20-18-18-14",1418);
        Sets sets131 = new Sets(null,2,3,"46-22-20-18-18-16",1558);
        Sets sets132 = new Sets(null,2,3,"46-24-22-18-18-16",1702);
        Sets sets133 = new Sets(null,2,3,"48-24-22-20-18-16",1850);
        Sets sets134 = new Sets(null,2,3,"48-24-22-20-20-16",2000);
        Sets sets135 = new Sets(null,2,3,"60",2060);
        //-----------situplevel3------------------------
        Sets sets136 = new Sets(null,3,3,"60-30-22-20-20-18",170);
        Sets sets137 = new Sets(null,3,3,"62-30-24-22-20-18",346);
        Sets sets138 = new Sets(null,3,3,"64-30-24-22-20-18",524);
        Sets sets139 = new Sets(null,3,3,"66-32-24-22-20-18",706);
        Sets sets140 = new Sets(null,3,3,"68-32-26-22-20-18",892);
        Sets sets141 = new Sets(null,3,3,"70-32-26-24-22-20",1086);
        Sets sets142 = new Sets(null,3,3,"72-34-26-24-22-20",1284);
        Sets sets143 = new Sets(null,3,3,"74-34-28-24-22-20",1486);
        Sets sets144 = new Sets(null,3,3,"76-34-28-24-24-20",1692);
        Sets sets145 = new Sets(null,3,3,"78-36-28-26-24-20",1904);
        Sets sets146 = new Sets(null,3,3,"80-36-30-26-24-22",2122);
        Sets sets147 = new Sets(null,3,3,"82-36-30-26-24-22",2342);
        Sets sets148 = new Sets(null,3,3,"84-38-30-26-26-22",2568);
        Sets sets149 = new Sets(null,3,3,"86-38-32-28-26-22",2800);
        Sets sets150 = new Sets(null,3,3,"88-38-32-28-26-22",3034);
        Sets sets151 = new Sets(null,3,3,"90-40-32-28-26-24",3274);
        Sets sets152 = new Sets(null,3,3,"92-40-34-28-28-24",3520);
        Sets sets153 = new Sets(null,3,3,"100",3620);
        //-----------squatlevel1------------------------
        Sets sets154 = new Sets(null,1,4,"4-3-3-2",12);
        Sets sets155 = new Sets(null,1,4,"5-4-3-3",27);
        Sets sets156 = new Sets(null,1,4,"6-5-5-3",46);
        Sets sets157 = new Sets(null,1,4,"7-6-5-4",68);
        Sets sets158 = new Sets(null,1,4,"10-8-6-5",97);
        Sets sets159 = new Sets(null,1,4,"13-9-6-5",130);
        Sets sets160 = new Sets(null,1,4,"15-10-8-5",168);
        Sets sets161 = new Sets(null,1,4,"17-10-8-6",209);
        Sets sets162 = new Sets(null,1,4,"20",229);
        //-----------squatlevel2------------------------
        Sets sets163 = new Sets(null,2,4,"20-16-14-15",229);
        Sets sets164 = new Sets(null,2,4,"24-16-15-16",136);
        Sets sets165 = new Sets(null,2,4,"28-16-16-18",214);
        Sets sets166 = new Sets(null,2,4,"32-18-14-22",300);
        Sets sets167 = new Sets(null,2,4,"36-18-15-24",393);
        Sets sets168 = new Sets(null,2,4,"40-18-16-26",493);
        Sets sets169 = new Sets(null,2,4,"44-20-14-30",601);
        Sets sets170 = new Sets(null,2,4,"48-20-14-30",713);
        Sets sets171 = new Sets(null,2,4,"48-20-15-32",828);
        Sets sets172 = new Sets(null,2,4,"52-20-16-34",950);
        Sets sets173 = new Sets(null,2,4,"56-22-14-38",1080);
        Sets sets174 = new Sets(null,2,4,"60-22-15-40",1217);
        Sets sets175 = new Sets(null,2,4,"64-22-16-42",1361);
        Sets sets176 = new Sets(null,2,4,"68-24-14-46",1513);
        Sets sets177 = new Sets(null,2,4,"72-24-15-48",1672);
        Sets sets178 = new Sets(null,2,4,"76-24-16-50",1838);
        Sets sets179 = new Sets(null,2,4,"84-26-15-56",2019);
        Sets sets180 = new Sets(null,2,4,"88-26-16-58",2207);
        Sets sets181 = new Sets(null,2,4,"100",2307);
        //-----------squatlevel3------------------------
        Sets sets182 = new Sets(null,3,4,"80-30-20-48",178);
        Sets sets183 = new Sets(null,3,4,"85-30-20-52",365);
        Sets sets184 = new Sets(null,3,4,"90-32-20-56",563);
        Sets sets185 = new Sets(null,3,4,"95-32-22-60",772);
        Sets sets186 = new Sets(null,3,4,"100-34-22-62",990);
        Sets sets187 = new Sets(null,3,4,"105-34-22-64",1215);
        Sets sets188 = new Sets(null,3,4,"110-36-24-66",1451);
        Sets sets189 = new Sets(null,3,4,"115-36-24-66",1692);
        Sets sets190 = new Sets(null,3,4,"120-37-24-66",1939);
        Sets sets191 = new Sets(null,3,4,"123-38-26-67",2193);
        Sets sets192 = new Sets(null,3,4,"126-39-26-67",2451);
        Sets sets193 = new Sets(null,3,4,"132-41-28-68",2720);
        Sets sets194 = new Sets(null,3,4,"135-42-28-68",2993);
        Sets sets195 = new Sets(null,3,4,"138-43-28-68",3270);
        Sets sets196 = new Sets(null,3,4,"141-44-30-69",3554);
        Sets sets197 = new Sets(null,3,4,"142-45-30-69",3840);
        Sets sets198 = new Sets(null,3,4,"143-46-30-69",2418);
        Sets sets199 = new Sets(null,3,4,"150",4278);
       /* //-----------dipslevel1------------------------
        Sets sets200 = new Sets(null,1,5,"1-1-1-1");
        Sets sets201 = new Sets(null,1,5,"1-2-2-1");
        Sets sets202 = new Sets(null,1,5,"2-2-1-2");
        Sets sets203 = new Sets(null,1,5,"2-2-2-2");
        Sets sets204 = new Sets(null,1,5,"2-3-3-2");
        Sets sets205 = new Sets(null,1,5,"3-3-2-2");
        Sets sets206 = new Sets(null,1,5,"4-3-2-2");
        Sets sets207 = new Sets(null,1,5,"4-3-3-2");
        Sets sets209 = new Sets(null,1,5,"4-4-3-2");
        Sets sets210 = new Sets(null,1,5,"4-4-3-3");
        Sets sets211 = new Sets(null,1,5,"4-4-4-3");
        Sets sets212 = new Sets(null,1,5,"5-4-4-3");
        Sets sets213 = new Sets(null,1,5,"5-5-4-3");
        Sets sets214 = new Sets(null,1,5,"5-5-5-3");
        Sets sets215 = new Sets(null,1,5,"6-5-4-4");
        Sets sets216 = new Sets(null,1,5,"6-6-4-4");
        Sets sets217 = new Sets(null,1,5,"7-5-5-4");
        Sets sets218 = new Sets(null,1,5,"10");
        //-----------dipslevel2------------------------
        Sets sets219 = new Sets(null,2,5,"6-4-3-4");
        Sets sets220 = new Sets(null,2,5,"6-4-3-4");
        Sets sets221 = new Sets(null,2,5,"8-5-3-4");
        Sets sets222 = new Sets(null,2,5,"8-5-4-4");
        Sets sets223 = new Sets(null,2,5,"9-6-4-4");
        Sets sets224 = new Sets(null,2,5,"9-6-4-4");
        Sets sets225 = new Sets(null,2,5,"10-6-4-6");
        Sets sets226 = new Sets(null,2,5,"10-8-6-6");
        Sets sets227 = new Sets(null,2,5,"12-8-6-6");
        Sets sets228 = new Sets(null,2,5,"12-8-6-6");
        Sets sets229 = new Sets(null,2,5,"13-10-6-6");
        Sets sets230 = new Sets(null,2,5,"13-10-8-6");
        Sets sets231 = new Sets(null,2,5,"14-10-8-7");
        Sets sets232 = new Sets(null,2,5,"14-11-8-7");
        Sets sets233 = new Sets(null,2,5,"15-11-8-7");
        Sets sets234 = new Sets(null,2,5,"15-11-10-8");
        Sets sets235 = new Sets(null,2,5,"16-12-10-8");
        Sets sets236 = new Sets(null,2,5,"16-12-10-8");
        Sets sets237 = new Sets(null,2,5,"20");
        //-----------dipslevel3------------------------
        Sets sets238 = new Sets(null,3,5,"18-10-8-10");
        Sets sets239 = new Sets(null,3,5,"18-10-8-10");
        Sets sets240 = new Sets(null,3,5,"18-10-8-10");
        Sets sets241 = new Sets(null,3,5,"20-10-8-10");
        Sets sets242 = new Sets(null,3,5,"20-11-9-10");
        Sets sets243 = new Sets(null,3,5,"20-11-9-10");
        Sets sets244 = new Sets(null,3,5,"22-11-9-10");
        Sets sets245 = new Sets(null,3,5,"22-11-9-10");
        Sets sets246 = new Sets(null,3,5,"22-12-10-10");
        Sets sets247 = new Sets(null,3,5,"24-12-10-14");
        Sets sets248 = new Sets(null,3,5,"24-12-10-14");
        Sets sets249 = new Sets(null,3,5,"26-11-13-14");
        Sets sets250 = new Sets(null,3,5,"26-11-13-14");
        Sets sets251 = new Sets(null,3,5,"28-13-11-14");
        Sets sets252 = new Sets(null,3,5,"28-14-12-14");
        Sets sets253 = new Sets(null,3,5,"28-14-12-14");
        Sets sets254 = new Sets(null,3,5,"30");*/
        setList.clear();
        setList.addAll(setsDAO.getSetsList());

        if (setList.isEmpty()) {
            setsDAO.insert(sets1);
            setsDAO.insert(sets2);
            setsDAO.insert(sets3);
            setsDAO.insert(sets4);
            setsDAO.insert(sets5);
            setsDAO.insert(sets6);
            setsDAO.insert(sets7);
            setsDAO.insert(sets8);
            setsDAO.insert(sets9);
            setsDAO.insert(sets10);
            setsDAO.insert(sets11);
            setsDAO.insert(sets12);
            setsDAO.insert(sets13);
            setsDAO.insert(sets14);
            setsDAO.insert(sets15);
            setsDAO.insert(sets16);
            setsDAO.insert(sets17);
            setsDAO.insert(sets18);
            setsDAO.insert(sets19);
            setsDAO.insert(sets20);
            setsDAO.insert(sets21);
            setsDAO.insert(sets22);
            setsDAO.insert(sets23);
            setsDAO.insert(sets24);
            setsDAO.insert(sets25);
            setsDAO.insert(sets26);
            setsDAO.insert(sets27);
            setsDAO.insert(sets28);
            setsDAO.insert(sets29);
            setsDAO.insert(sets30);
            setsDAO.insert(sets31);
            setsDAO.insert(sets32);
            setsDAO.insert(sets33);
            setsDAO.insert(sets34);
            setsDAO.insert(sets35);
            setsDAO.insert(sets36);
            setsDAO.insert(sets37);
            setsDAO.insert(sets38);
            setsDAO.insert(sets39);
            setsDAO.insert(sets40);
            setsDAO.insert(sets41);
            setsDAO.insert(sets42);
            setsDAO.insert(sets43);
            setsDAO.insert(sets44);
            setsDAO.insert(sets45);
            setsDAO.insert(sets46);
            setsDAO.insert(sets47);
            setsDAO.insert(sets48);
            setsDAO.insert(sets49);
            setsDAO.insert(sets50);
            setsDAO.insert(sets51);
            setsDAO.insert(sets52);
            setsDAO.insert(sets53);
            setsDAO.insert(sets54);
            setsDAO.insert(sets55);
            setsDAO.insert(sets56);
            setsDAO.insert(sets57);
            setsDAO.insert(sets58);
            setsDAO.insert(sets59);
            setsDAO.insert(sets60);
            setsDAO.insert(sets61);
            setsDAO.insert(sets62);
            setsDAO.insert(sets63);
            setsDAO.insert(sets64);
            setsDAO.insert(sets65);
            setsDAO.insert(sets66);
            setsDAO.insert(sets67);
            setsDAO.insert(sets68);
            setsDAO.insert(sets69);
            setsDAO.insert(sets70);
            setsDAO.insert(sets71);
            setsDAO.insert(sets72);
            setsDAO.insert(sets73);
            setsDAO.insert(sets74);
            setsDAO.insert(sets75);
            setsDAO.insert(sets76);
            setsDAO.insert(sets77);
            setsDAO.insert(sets78);
            setsDAO.insert(sets79);
            setsDAO.insert(sets80);
            setsDAO.insert(sets81);
            setsDAO.insert(sets82);
            setsDAO.insert(sets83);
            setsDAO.insert(sets84);
            setsDAO.insert(sets85);
            setsDAO.insert(sets86);
            setsDAO.insert(sets87);
            setsDAO.insert(sets88);
            setsDAO.insert(sets89);
            setsDAO.insert(sets90);
            setsDAO.insert(sets91);
            setsDAO.insert(sets92);
            setsDAO.insert(sets93);
            setsDAO.insert(sets94);
            setsDAO.insert(sets95);
            setsDAO.insert(sets96);
            setsDAO.insert(sets97);
            setsDAO.insert(sets98);
            setsDAO.insert(sets99);
            setsDAO.insert(sets100);
            setsDAO.insert(sets101);
            setsDAO.insert(sets102);
            setsDAO.insert(sets103);
            setsDAO.insert(sets104);
            setsDAO.insert(sets105);
            setsDAO.insert(sets106);
            setsDAO.insert(sets107);
            setsDAO.insert(sets108);
            setsDAO.insert(sets109);
            setsDAO.insert(sets110);
            setsDAO.insert(sets111);
            setsDAO.insert(sets112);
            setsDAO.insert(sets113);
            setsDAO.insert(sets114);
            setsDAO.insert(sets115);
            setsDAO.insert(sets116);
            setsDAO.insert(sets117);
            setsDAO.insert(sets118);
            setsDAO.insert(sets119);
            setsDAO.insert(sets120);
            setsDAO.insert(sets121);
            setsDAO.insert(sets122);
            setsDAO.insert(sets123);
            setsDAO.insert(sets124);
            setsDAO.insert(sets125);
            setsDAO.insert(sets126);
            setsDAO.insert(sets127);
            setsDAO.insert(sets128);
            setsDAO.insert(sets129);
            setsDAO.insert(sets130);
            setsDAO.insert(sets131);
            setsDAO.insert(sets132);
            setsDAO.insert(sets133);
            setsDAO.insert(sets134);
            setsDAO.insert(sets135);
            setsDAO.insert(sets136);
            setsDAO.insert(sets137);
            setsDAO.insert(sets138);
            setsDAO.insert(sets139);
            setsDAO.insert(sets140);
            setsDAO.insert(sets141);
            setsDAO.insert(sets142);
            setsDAO.insert(sets143);
            setsDAO.insert(sets144);
            setsDAO.insert(sets145);
            setsDAO.insert(sets146);
            setsDAO.insert(sets147);
            setsDAO.insert(sets148);
            setsDAO.insert(sets149);
            setsDAO.insert(sets150);
            setsDAO.insert(sets151);
            setsDAO.insert(sets152);
            setsDAO.insert(sets153);
            setsDAO.insert(sets154);
            setsDAO.insert(sets155);
            setsDAO.insert(sets156);
            setsDAO.insert(sets157);
            setsDAO.insert(sets158);
            setsDAO.insert(sets159);
            setsDAO.insert(sets160);
            setsDAO.insert(sets161);
            setsDAO.insert(sets162);
            setsDAO.insert(sets163);
            setsDAO.insert(sets164);
            setsDAO.insert(sets165);
            setsDAO.insert(sets166);
            setsDAO.insert(sets167);
            setsDAO.insert(sets168);
            setsDAO.insert(sets169);
            setsDAO.insert(sets170);
            setsDAO.insert(sets171);
            setsDAO.insert(sets172);
            setsDAO.insert(sets173);
            setsDAO.insert(sets174);
            setsDAO.insert(sets175);
            setsDAO.insert(sets176);
            setsDAO.insert(sets177);
            setsDAO.insert(sets178);
            setsDAO.insert(sets179);
            setsDAO.insert(sets180);
            setsDAO.insert(sets181);
            setsDAO.insert(sets182);
            setsDAO.insert(sets183);
            setsDAO.insert(sets184);
            setsDAO.insert(sets185);
            setsDAO.insert(sets186);
            setsDAO.insert(sets187);
            setsDAO.insert(sets188);
            setsDAO.insert(sets189);
            setsDAO.insert(sets190);
            setsDAO.insert(sets191);
            setsDAO.insert(sets192);
            setsDAO.insert(sets193);
            setsDAO.insert(sets194);
            setsDAO.insert(sets195);
            setsDAO.insert(sets196);
            setsDAO.insert(sets197);
            setsDAO.insert(sets198);
            setsDAO.insert(sets199);
           /* setsDAO.insert(sets200);
            setsDAO.insert(sets201);
            setsDAO.insert(sets202);
            setsDAO.insert(sets203);
            setsDAO.insert(sets204);
            setsDAO.insert(sets205);
            setsDAO.insert(sets206);
            setsDAO.insert(sets207);
            setsDAO.insert(sets209);
            setsDAO.insert(sets210);
            setsDAO.insert(sets211);
            setsDAO.insert(sets212);
            setsDAO.insert(sets213);
            setsDAO.insert(sets214);
            setsDAO.insert(sets215);
            setsDAO.insert(sets216);
            setsDAO.insert(sets217);
            setsDAO.insert(sets218);
            setsDAO.insert(sets219);
            setsDAO.insert(sets220);
            setsDAO.insert(sets221);
            setsDAO.insert(sets222);
            setsDAO.insert(sets223);
            setsDAO.insert(sets224);
            setsDAO.insert(sets225);
            setsDAO.insert(sets226);
            setsDAO.insert(sets227);
            setsDAO.insert(sets228);
            setsDAO.insert(sets229);
            setsDAO.insert(sets230);
            setsDAO.insert(sets231);
            setsDAO.insert(sets232);
            setsDAO.insert(sets233);
            setsDAO.insert(sets234);
            setsDAO.insert(sets235);
            setsDAO.insert(sets236);
            setsDAO.insert(sets237);
            setsDAO.insert(sets238);
            setsDAO.insert(sets239);
            setsDAO.insert(sets240);
            setsDAO.insert(sets241);
            setsDAO.insert(sets242);
            setsDAO.insert(sets243);
            setsDAO.insert(sets244);
            setsDAO.insert(sets245);
            setsDAO.insert(sets246);
            setsDAO.insert(sets247);
            setsDAO.insert(sets248);
            setsDAO.insert(sets249);
            setsDAO.insert(sets250);
            setsDAO.insert(sets251);
            setsDAO.insert(sets252);
            setsDAO.insert(sets253);
            setsDAO.insert(sets254);*/
            Toast.makeText(getApplicationContext(),"Sets Successeded", Toast.LENGTH_SHORT).show();
        }
    }
}

