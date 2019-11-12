package com.pattersonhs.hgomez.quizappalgebrahg;

public class Question {

    String questionText;
    boolean correctAnwers;

    public Question(String newQT, boolean newcorrectAnwers)
    {
        questionText=newQT;
        correctAnwers=newcorrectAnwers;
    }

    public String getQuestionText()
    {
        return questionText;
    }

    public void setQuestionText(String newQuestionsText)
    {
        questionText=newQuestionsText;
    }

    public boolean getcorrectAnwers()
    {
        return correctAnwers;
    }

    public void setCorrectAnwers(boolean newcorrectAwers)
    {
        correctAnwers=newcorrectAwers;
    }
}
