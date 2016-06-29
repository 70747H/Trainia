package com.example.TrainiaTeam.Trainia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

import TrainiaDB.gen.LevelDAO;
import TrainiaDB.gen.LevelDAOImpl;
import TrainiaDB.gen.Workoutlevel;
import TrainiaDB.gen.WorkoutlevelDAO;
import TrainiaDB.gen.WorkoutlevelDAOImpl;
import TrainiaDB.runtime.util.SimpleSQLiteOpenHelper;

public class LevelActivty extends AppCompatActivity {
    private SessionManager manager;
    private List levelList = new LinkedList<>();
    private List workoutLevelList = new LinkedList<>();
    private LevelAdapter mAdapter;
    private TrainiaDB.gen.Level level1,level2,level3;
    private Workoutlevel woLevel1,woLevel2,woLevel3;
    private long selectedLevelId;
    private String sWoId;
    private Integer iWoId;
    String levelsNames[] = new String[3];
    String woLevelsReps[] = new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_activty);

        manager = new SessionManager();
        sWoId = manager.getPreferences(LevelActivty.this,"selectedWorkoutId");
        iWoId = Integer.valueOf(sWoId);

        prepareLevelData();

        mAdapter = new LevelAdapter(LevelActivty.this, levelsNames,woLevelsReps);
        ListView lv = (ListView) findViewById(R.id.list_view);
        lv.setAdapter(mAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                selectedLevelId = id+1;
                Toast.makeText(getApplicationContext(), "level Clicked" + selectedLevelId, Toast.LENGTH_SHORT).show();

                if(iWoId == 1){
                    manager.setPreferences(LevelActivty.this, "pushupSelectedLevelId", String.valueOf(selectedLevelId));
                    startActivity(new Intent(LevelActivty.this,Push_up.class));
                }else if(iWoId == 2){
                    manager.setPreferences(LevelActivty.this, "PullupSelectedLevelId", String.valueOf(selectedLevelId));
                    startActivity(new Intent(LevelActivty.this,Pull_up.class));
                }else if(iWoId == 3){
                    manager.setPreferences(LevelActivty.this, "situpSelectedLevelId", String.valueOf(selectedLevelId));
                    startActivity(new Intent(LevelActivty.this,Sit_up.class));
                }else if(iWoId == 4){
                    manager.setPreferences(LevelActivty.this, "squatSelectedLevelId", String.valueOf(selectedLevelId));
                    startActivity(new Intent(LevelActivty.this,Squat.class));
                }
            }
        });
    }

    private void prepareLevelData() {
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(LevelActivty.this);
        LevelDAO levelDAO = new LevelDAOImpl(helper);
        levelList = levelDAO.getLevelList();
        level1 = (TrainiaDB.gen.Level) levelList.get(0);
        level2 = (TrainiaDB.gen.Level) levelList.get(1);
        level3 = (TrainiaDB.gen.Level) levelList.get(2);
        levelsNames[0] = level1.getLevelName();
        levelsNames[1] = level2.getLevelName();
        levelsNames[2] = level3.getLevelName();

        WorkoutlevelDAO workoutlevelDAO = new WorkoutlevelDAOImpl(helper);
        workoutLevelList = workoutlevelDAO.getWorkoutlevelList(workoutlevelDAO.WORKOUT_ID.eq(iWoId));
        woLevel1 = (Workoutlevel) workoutLevelList.get(0);
        woLevel2 = (Workoutlevel) workoutLevelList.get(1);
        woLevel3 = (Workoutlevel) workoutLevelList.get(2);
        woLevelsReps [0] = woLevel1.getReps();
        woLevelsReps [1] = woLevel2.getReps();
        woLevelsReps [2] = woLevel3.getReps();
    }
}
