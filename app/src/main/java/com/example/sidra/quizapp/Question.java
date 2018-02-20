package com.example.sidra.quizapp;

/**
 * Created by Sidra on 11/23/2017.
 */

public class Question {
    private int q_id;
    private String q_text;
    private Answer answer;

    public Question(int id, String text, Answer ans) {
        this.q_id=id;
        this.q_text=text;
        this.answer=ans;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Answer getAnswer() {

        return answer;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public void setQ_text(String q1_text) {
        this.q_text = q1_text;
    }

    public int getQ_id() {

        return q_id;
    }

    public String getQ_text() {
        return q_text;
    }


}
