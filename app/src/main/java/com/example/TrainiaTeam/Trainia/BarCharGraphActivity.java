package com.example.TrainiaTeam.Trainia;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class BarCharGraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_char_gragh);

        BarChart barChart = (BarChart) findViewById(R.id.chart);
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f, 0));
        entries.add(new BarEntry(8f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(12f, 3));
        entries.add(new BarEntry(18f, 4));
        entries.add(new BarEntry(9f, 5));

        BarDataSet dataset = new BarDataSet(entries, "");
        dataset.setValueTextColor(Color.WHITE);

        barChart.setDrawBarShadow(false);
        barChart.setDrawValueAboveBar(true);
        barChart.setDescription("");
        barChart.setMaxVisibleValueCount(60);
        barChart.setPinchZoom(true);
        barChart.setDrawGridBackground(false);
        barChart.getAxisLeft().setDrawTopYLabelEntry(true);
        barChart.getAxisRight().setDrawAxisLine(false);
        barChart.getAxisRight().setDrawGridLines(false);
        barChart.setDrawBarShadow(false);
        barChart.getAxisLeft().setTextColor(Color.WHITE);
        barChart.getXAxis().setTextColor(Color.WHITE);
        XAxis xAxis = barChart.getXAxis();
        xAxis.setLabelsToSkip(0);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        barChart.setAlpha((float) 0.5);
        barChart.setDescriptionColor(Color.WHITE);
        barChart.setDrawValueAboveBar(true);
        barChart.setCameraDistance(5);
        barChart.setDrawValueAboveBar(true);
        xAxis.setDrawGridLines(false);
        xAxis.setSpaceBetweenLabels(2);
        xAxis.setTextSize(10);
        xAxis.setGridLineWidth(5);

        YAxis leftAxis = barChart.getAxisLeft();
        YAxis rightAxis = barChart.getAxisRight();
        rightAxis.setDrawLabels(false);
        leftAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        leftAxis.setSpaceTop(10f);
        BarData data = new BarData(labels, dataset);
        dataset.setColor(Color.WHITE); //
        barChart.setData(data);
        barChart.animateY(5000);

    }
}
