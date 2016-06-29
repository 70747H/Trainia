package com.example.TrainiaTeam.Trainia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.DecimalMax;
import com.mobsandgeeks.saripaar.annotation.DecimalMin;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import java.util.LinkedList;
import java.util.List;

import TrainiaDB.gen.Activitylevel;
import TrainiaDB.gen.ActivitylevelDAO;
import TrainiaDB.gen.ActivitylevelDAOImpl;
import TrainiaDB.gen.User;
import TrainiaDB.gen.UserDAO;
import TrainiaDB.gen.UserDAOImpl;
import TrainiaDB.runtime.util.SimpleSQLiteOpenHelper;

public class Sign_up_2 extends AppCompatActivity implements Validator.ValidationListener {

    @NotEmpty
    @DecimalMin(value = 50.0)
    @DecimalMax(value = 150.0)
    private EditText edtWeight;
    @NotEmpty
    @DecimalMin(value = 60.0)
    @DecimalMax(value = 210.0)
    private EditText edtHeight;

    private float fWeight;
    private float fHeight;
    private ImageButton btnSubmit;
    private Validator validator;
    private User userObjInToClass;
    private MyActivityLevelExpandableListAdapter mActivityLevelAdapter;
    private MyGoalExpandableListAdapter mGoalAdapter;
    private ExpandableListView ActvityLevelExpListView,goalExpListView;
    private SessionManager manager;
    public String sGoal;
    Integer iActivityLevel;
    Integer iGoal;
    double iDailyCalorie;
    public String goals [][] = new String[6][6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_2);

        ActvityLevelExpListView = (ExpandableListView) findViewById(R.id.expandableListView2);
        goalExpListView = (ExpandableListView) findViewById(R.id.expandableListView);

        mActivityLevelAdapter = new MyActivityLevelExpandableListAdapter();
        ActvityLevelExpListView.setAdapter(mActivityLevelAdapter);

        mGoalAdapter = new MyGoalExpandableListAdapter();
        goalExpListView.setAdapter(mGoalAdapter);

        edtWeight = (EditText) findViewById(R.id.edit_wtight);
        edtHeight = (EditText) findViewById(R.id.edit_height);
        btnSubmit = (ImageButton) findViewById(R.id.submit);

        userObjInToClass = (User) getIntent().getSerializableExtra("MyClass");
        Toast toast = Toast.makeText(this, userObjInToClass.getName(), Toast.LENGTH_SHORT);
        toast.show();

        manager = new SessionManager();

        ActvityLevelExpListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                ActvityLevelExpListView.collapseGroup(groupPosition);
                Long selectedActivityLevelId = id+1;
                iActivityLevel = Integer.parseInt(String.valueOf(selectedActivityLevelId));
                manager.setPreferences(Sign_up_2.this,"selectedActivityLevelId",String.valueOf(selectedActivityLevelId));
                Toast.makeText(getApplicationContext(), "ActivityLevel Clicked"+selectedActivityLevelId, Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        goalExpListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                goalExpListView.collapseGroup(groupPosition);
                Long selectedGoalId = id+1;
                iGoal = Integer.parseInt(String.valueOf(selectedGoalId));
                manager.setPreferences(Sign_up_2.this,"selectedActivityLevelId",String.valueOf(selectedGoalId));
                Toast.makeText(getApplicationContext(), "ActivityLevel Clicked"+selectedGoalId, Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        validator = new Validator(this);
        validator.setValidationListener(this);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validator.validate();
            }
        });
    }

    private void saveUser() {
        goals = mGoalAdapter.getChildren();
        fHeight = Float.parseFloat(String.valueOf(edtHeight.getText()));
        fWeight = Float.parseFloat(String.valueOf(edtWeight.getText()));
        userObjInToClass.setHeight(fHeight);
        userObjInToClass.setWeight(fWeight);
        userObjInToClass.setGoal(goals[0][iGoal-1]);
        userObjInToClass.setActivitylevelId(iActivityLevel);

        if(userObjInToClass.getGender().equalsIgnoreCase("male")){
            iDailyCalorie = 66 + (6.23 * userObjInToClass.getWeight() * 2.20462) + (12.7 * userObjInToClass.getHeight() * 0.393701) - (6.8 * userObjInToClass.getAge());
        }else if(userObjInToClass.getGender().equalsIgnoreCase("female")){
            iDailyCalorie = 655 + (4.35 * userObjInToClass.getWeight() * 2.20462) + (4.7 * userObjInToClass.getHeight() * 0.393701) - (4.7 * userObjInToClass.getAge());
        }

        if(goals[0][iGoal-1].equalsIgnoreCase("gain weight")){
            iDailyCalorie += 500;
        }else if(goals[0][iGoal-1].equalsIgnoreCase("lose weight")){
            iDailyCalorie -= 500;
        }

        userObjInToClass.setDailycalorie((float) iDailyCalorie);

        SimpleSQLiteOpenHelper helper = new DatabaseHelper(getApplicationContext());
        UserDAO userDAO = new UserDAOImpl(helper);
        userDAO.insert(userObjInToClass);
        Toast.makeText(getApplicationContext(), "User Added", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onValidationSucceeded() {
        Toast.makeText(this, "Yay! we got it right!", Toast.LENGTH_SHORT).show();
        saveUser();
        manager.setPreferences(Sign_up_2.this,"status","1");
        manager.setPreferences(Sign_up_2.this, "id", String.valueOf(userObjInToClass.getId()));
        startActivity(new Intent(this,Profile.class));
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

    public class MyActivityLevelExpandableListAdapter extends BaseExpandableListAdapter {
        // Sample data set. children[ii] contains the children (String[]) for
        // groups[ii].

        private String[] childrenNames = activityLevelDataPrepartion();

        private String[] groups = {"Activity Level"};
        private String[][] children = {{childrenNames[0], childrenNames[1], childrenNames[2], childrenNames[3],childrenNames[4],childrenNames[5]}};

        public Object getChild(int groupPosition, int childPosition) {
            return children[groupPosition][childPosition];
        }

        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        public int getChildrenCount(int groupPosition) {
            return children[groupPosition].length;
        }


        public View getChildView(int groupPosition, int childPosition,
                                 boolean isLastChild, View convertView, ViewGroup parent) {
            final String
                    child_text = (String) getChild(groupPosition, childPosition);
            LayoutInflater
                    inflater = Sign_up_2.this.getLayoutInflater();

            if (convertView == null) {
                convertView =
                        inflater.inflate(R.layout.activity_level_child_row, null);
            }

            TextView item = (TextView) convertView.findViewById(R.id.grp_child);
            item.setText(child_text);
            return convertView;
        }

        public Object getGroup(int groupPosition) {
            return groups[groupPosition];
        }

        public int getGroupCount() {
            return groups.length;
        }

        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        public View getGroupView(int groupPosition, boolean isExpanded,
                                 View convertView, ViewGroup parent) {
            final String
                    child_text = (String) getGroup(groupPosition);
            LayoutInflater
                    inflater = Sign_up_2.this.getLayoutInflater();

            if (convertView == null) {
                convertView =
                        inflater.inflate(R.layout.activity_level_group_row, null);
            }

            TextView item = (TextView) convertView.findViewById(R.id.row_Activity_level);
            item.setText(child_text);
            return convertView;
        }

        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return true;
        }

        @Override
        public boolean areAllItemsEnabled() {
            return super.areAllItemsEnabled();
        }

        public boolean hasStableIds() {
            return true;
        }
    }
    public String[] activityLevelDataPrepartion(){
        List Activitylevels  = new LinkedList();
        Activitylevel activitylevel1,activitylevel2,activitylevel3,activitylevel4,activitylevel5;
        String[] actLvNameDescr = new String[6];
        SimpleSQLiteOpenHelper helper = new DatabaseHelper(Sign_up_2.this);
        ActivitylevelDAO activitylevelDAO = new ActivitylevelDAOImpl(helper);
        Activitylevels = activitylevelDAO.getActivitylevelList();
        activitylevel1 = (Activitylevel) Activitylevels.get(0);
        activitylevel2 = (Activitylevel) Activitylevels.get(1);
        activitylevel3 = (Activitylevel) Activitylevels.get(2);
        activitylevel4 = (Activitylevel) Activitylevels.get(3);
        activitylevel5 = (Activitylevel) Activitylevels.get(4);
        actLvNameDescr[0] = activitylevel1.getActivitylevelName()+activitylevel1.getDescription();
        actLvNameDescr[1] = activitylevel2.getActivitylevelName()+activitylevel2.getDescription();
        actLvNameDescr[2] = activitylevel3.getActivitylevelName()+activitylevel3.getDescription();
        actLvNameDescr[3] = activitylevel4.getActivitylevelName()+activitylevel4.getDescription();
        actLvNameDescr[4] = activitylevel5.getActivitylevelName()+activitylevel5.getDescription();

        return actLvNameDescr;
    }
    public class MyGoalExpandableListAdapter extends BaseExpandableListAdapter {
        // Sample data set. children[ii] contains the children (String[]) for
        // groups[ii].

        public String[][] getChildren() {
            return children;
        }
        public String[] groups = {"Goal"};
        public String[][] children = {{"Gain weight","Fit","Lose Weight"}};

        public Object getChild(int groupPosition, int childPosition) {
            return children[groupPosition][childPosition];
        }

        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        public int getChildrenCount(int groupPosition) {
            return children[groupPosition].length;
        }


        public View getChildView(int groupPosition, int childPosition,
                                 boolean isLastChild, View convertView, ViewGroup parent) {
            final String
                    child_text = (String) getChild(groupPosition, childPosition);
            LayoutInflater
                    inflater = Sign_up_2.this.getLayoutInflater();

            if (convertView == null) {
                convertView =
                        inflater.inflate(R.layout.goal_child_row, null);
            }

            TextView item = (TextView) convertView.findViewById(R.id.grp_child);
            item.setText(child_text);
            return convertView;
        }

        public Object getGroup(int groupPosition) {
            return groups[groupPosition];
        }

        public int getGroupCount() {
            return groups.length;
        }

        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        public View getGroupView(int groupPosition, boolean isExpanded,
                                 View convertView, ViewGroup parent) {
            final String
                    child_text = (String) getGroup(groupPosition);
            LayoutInflater
                    inflater = Sign_up_2.this.getLayoutInflater();

            if (convertView == null) {
                convertView =
                        inflater.inflate(R.layout.goal_group_row, null);
            }

            TextView item = (TextView) convertView.findViewById(R.id.row_goal);
            item.setText(child_text);
            return convertView;
        }

        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return true;
        }

        public boolean hasStableIds() {
            return true;
        }
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
}
