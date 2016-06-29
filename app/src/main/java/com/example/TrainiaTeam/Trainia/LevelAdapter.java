package com.example.TrainiaTeam.Trainia;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Hussien on 23-Jun-16.
 */
public class LevelAdapter extends ArrayAdapter{
    String[] level_names;
    String[] level_reps;
    Context context;
    public LevelAdapter(Activity context, String[] text,String[] text2){
        super(context, R.layout.level_child_row, text);
        // TODO Auto-generated constructor stub
        this.level_names = text;
        this.level_reps = text2;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View single_row = inflater.inflate(R.layout.level_child_row, null, true);
        TextView textView = (TextView) single_row.findViewById(R.id.level_child);
        TextView textView2 = (TextView) single_row.findViewById(R.id.level_child2);
        textView.setText(level_names[position]);
        textView2.setText(level_reps[position]);

        return single_row;
    }
}