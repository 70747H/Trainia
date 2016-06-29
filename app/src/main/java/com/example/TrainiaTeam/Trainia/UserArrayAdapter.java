package com.example.TrainiaTeam.Trainia;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import TrainiaDB.gen.User;

/**
 * Created by Hussien on 05-May-16.
 */
public class UserArrayAdapter extends ArrayAdapter {

    public UserArrayAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = (TextView) super.getView(position, convertView, parent);
        User user = (User) getItem(position);
        textView.setText(user.getId() + " - " + user.getEmail() + " - " + user.getPassword());
        return textView;
    }

}

