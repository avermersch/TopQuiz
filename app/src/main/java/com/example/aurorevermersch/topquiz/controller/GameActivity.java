package com.example.aurorevermersch.topquiz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aurorevermersch.topquiz.R;
import com.example.aurorevermersch.topquiz.model.Question;
import com.example.aurorevermersch.topquiz.model.QuestionBank;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity implements View.OnClickListener{

    //Déclaration des variables
    private TextView mQuestionTextView;
    private Button mAnswerButton1, mAnswerButton2, mAnswerButton3, mAnswerButton4;

    private QuestionBank mQuestionBank;
    private  int mScore;

    private  Question mCurrentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mQuestionBank = this.generateQuestions();

        //Référencement des éléments graphiques dans la méthode onCreate
        mQuestionTextView = (TextView) findViewById(R.id.activity_game_question_text);
        mAnswerButton1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        mAnswerButton2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mAnswerButton3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mAnswerButton4 = (Button) findViewById(R.id.activity_game_answer4_btn);

        //Même écouteur pour les quatres boutons
        //C'est la valeur du tag qui sera utilisée pour distinguer le bouton déclenché
        mAnswerButton1.setOnClickListener(this);
        mAnswerButton2.setOnClickListener(this);
        mAnswerButton3.setOnClickListener(this);
        mAnswerButton4.setOnClickListener(this);

        //On assigne un identifiant grace au tag pour chaque bouton
        mAnswerButton1.setTag(0);
        mAnswerButton2.setTag(1);
        mAnswerButton3.setTag(2);
        mAnswerButton4.setTag(3);
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

    //Définition du texte pour la vue texte de la question et des quatres boutons
    private void displayQuestion(final Question question){
        mQuestionTextView.setText(question.getQuestion());
        mAnswerButton1.setText(question.getChoiceList().get(0));
        mAnswerButton2.setText(question.getChoiceList().get(1));
        mAnswerButton3.setText(question.getChoiceList().get(2));
        mAnswerButton4.setText(question.getChoiceList().get(3));

    }

    @Override
    public void onClick(View v) {
        int responseIndex = (int) v.getTag();

        if(responseIndex == mCurrentQuestion.getAnswerIndex()) {
            //Bonne réponse
            Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();
            mScore ++;
        } else {
            //Mauvaise réponse
            Toast.makeText(this, "Mauvaise réponse", Toast.LENGTH_SHORT).show();
        }

    }
}
