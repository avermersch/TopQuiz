package com.example.aurorevermersch.topquiz.model;

import java.util.List;

/**
 * Created by aurorevermersch on 14/01/2018.
 */

public class Question {

    //Déclaration des variables
    private String mQuestion;
    private List<String> mChoiceList;
    private int mAnswerIndex;

    //Création du Constructeur
    public Question(String question, List<String> choiceList, int answerIndex) {
        this.setQuestion (question);
        this.setChoiceList (choiceList);
        this.setAnswerIndex (answerIndex);
    }

    //Création des getters et setters
    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public List<String> getChoiceList() {
        return mChoiceList;
    }

    //Les paramètres doivent être correctement valorisés
    //La liste des réponses doit contenir au moins une entrée
    public void setChoiceList(List<String> choiceList) {
        if (choiceList == null) {
            throw new IllegalArgumentException("Le tableau ne peut pas être null");
        }
        mChoiceList = choiceList;
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    //Les paramètres doivent être correctement valorisés
    //L'index de réponse doit être compris entre 0 et le nombre de réponse possible
    public void setAnswerIndex(int answerIndex) {
        if (answerIndex < 0 || answerIndex >= mChoiceList.size()) {
            throw new IllegalArgumentException("L'index de la réponse est hors limite");
        }
        mAnswerIndex = answerIndex;
    }
}
