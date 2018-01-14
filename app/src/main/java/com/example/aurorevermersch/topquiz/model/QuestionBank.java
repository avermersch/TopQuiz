package com.example.aurorevermersch.topquiz.model;

import java.util.Collections;
import java.util.List;

/**
 * Created by aurorevermersch on 14/01/2018.
 */

public class QuestionBank {

    //Déclaration des variables
    private List<Question> mQuestionList;
    private int mNextQuestionIndex;

    //Mélange la liste de question avant de la stocker
    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;

        //Implémentation de la méthode
        Collections.shuffle(mQuestionList);

        mNextQuestionIndex = 0;
    }

    //Boucle les questions et en renvoie une nouvelle à chaque fois
    public Question getQuestion() {

        //Implémentation de la méthode
        if(mNextQuestionIndex == mQuestionList.size()) {
            mNextQuestionIndex = 0;
        }
        //Post-incrémentation
        return mQuestionList.get(mNextQuestionIndex ++);
    }
}
