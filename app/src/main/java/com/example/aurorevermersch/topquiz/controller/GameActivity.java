package com.example.aurorevermersch.topquiz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.aurorevermersch.topquiz.R;
import com.example.aurorevermersch.topquiz.model.Question;
import com.example.aurorevermersch.topquiz.model.QuestionBank;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity {

    //Déclaration des variables
    private TextView gQuestionText;
    private Button gAnswer1, gAnswer2, gAnswer3, gAnswer4;
    private QuestionBank mQuestionBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mQuestionBank = this.generateQuestions();

        //Référencement des éléments graphiques dans la méthode onCreate
        gQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        gAnswer1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        gAnswer2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        gAnswer3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        gAnswer4 = (Button) findViewById(R.id.activity_game_answer4_btn);
    }

    //Création de la méthode permettant de générer les différentes questions
    private QuestionBank generateQuestions(){

        Question question1 = new Question("Qui est le créateur d'Android?",
                                        Arrays.asList("Andy Rubin",
                                                    "Steve Wozniak",
                                                    "Jake Wharton",
                                                    "Paul Smith"),
                                        0);

        Question question2 = new Question("Quand le premier homme a atteri sur la lune?",
                                        Arrays.asList("1958",
                                                    "1962",
                                                    "1967",
                                                    "1969"),
                                        3);

        Question question3 = new Question("Quel est le numéro de la maison des Simpsons?",
                                        Arrays.asList("42",
                                                    "101",
                                                    "666",
                                                    "742"),
                                        3);

        return new QuestionBank(Arrays.asList(question1, question2, question3));
    }

}
