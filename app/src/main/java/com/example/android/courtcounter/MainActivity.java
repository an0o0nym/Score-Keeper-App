package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int totalA = 0;
    int totalB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(totalA);
        displayForTeamB(totalB);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        totalA = 0;
        totalB = 0;
        displayForTeamA(totalA);
        displayForTeamB(totalB);
    }

    public void addThreePointsA(View view) {
        totalA += 3;
        displayForTeamA(totalA);
    }

    public void addTwoPointsA(View view) {
        totalA += 2;
        displayForTeamA(totalA);
    }

    public void addOnePointA(View view) {
        totalA += 1;
        displayForTeamA(totalA);
    }

    public void addThreePointsB(View view) {
        totalB += 3;
        displayForTeamB(totalB);
    }

    public void addTwoPointsB(View view) {
        totalB += 2;
        displayForTeamB(totalB);
    }

    public void addOnePointB(View view) {
        totalB += 1;
        displayForTeamB(totalB);
    }
}
