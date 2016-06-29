package com.example.TrainiaTeam.Trainia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

import TrainiaDB.gen.UserDAO;
import TrainiaDB.gen.UserDAOImpl;

public class ViewUsersActivity extends AppCompatActivity {

    private UserDAO userDAO;

    private List userList = new LinkedList();

    private com.example.TrainiaTeam.Trainia.UserArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user);

        userDAO = new UserDAOImpl(new com.example.TrainiaTeam.Trainia.DatabaseHelper(this.getApplicationContext()));
        ListView listView = (ListView) findViewById(R.id.listView);
        adapter = new com.example.TrainiaTeam.Trainia.UserArrayAdapter(this.getApplicationContext(),
                R.layout.user_list_item, userList);
        listView.setAdapter(adapter);

    }

    @Override
    protected void onResume() {
        super.onResume();
        userList.clear();
        userList.addAll(userDAO.getUserList());
        adapter.notifyDataSetChanged();
    }

    public void addUser(View view) {
        Intent intent = new Intent(ViewUsersActivity.this, Sign_up.class);
        startActivity(intent);
    }

}
