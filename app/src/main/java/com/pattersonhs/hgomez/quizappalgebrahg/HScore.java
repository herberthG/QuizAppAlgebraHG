package com.pattersonhs.hgomez.quizappalgebrahg;


public class HScore {

    String UserName;
    int Score;

    public HScore(String newUsername, int newScore)
    {
        UserName=newUsername;
        Score=newScore;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }
}
