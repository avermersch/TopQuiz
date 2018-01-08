package com.example.aurorevermersch.topquiz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.aurorevermersch.topquiz.R;

public class GameActivity extends AppCompatActivity {

    private TextView gQuestionText;
    private Button gAnswer1, gAnswer2, gAnswer3, gAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        gQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        gAnswer1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        gAnswer2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        gAnswer3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        gAnswer4 = (Button) findViewById(R.id.activity_game_answer4_btn);
    }
}
