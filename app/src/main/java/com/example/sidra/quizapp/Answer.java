package com.example.sidra.quizapp;

/**
 * Created by Sidra on 11/23/2017.
 */

public class Answer {
    int correct_ans_id;
    String a1_text;
    String a2_text;
    String a3_text;
    String a4_text;

    public Answer(int a_id, String a1_text, String a2_text, String a3_text, String a4_text) {
        this.correct_ans_id = a_id;
        this.a1_text = a1_text;
        this.a2_text = a2_text;
        this.a3_text = a3_text;
        this.a4_text = a4_text;
    }

    public void setA_id(int a_id) {
        this.correct_ans_id = a_id;
    }

    public void setA1_text(String a1_text) {
        this.a1_text = a1_text;
    }

    public void setA2_text(String a2_text) {
        this.a2_text = a2_text;
    }

    public void setA3_text(String a3_text) {
        this.a3_text = a3_text;
    }

    public void setA4_text(String a4_text) {
        this.a4_text = a4_text;
    }

    public int getA_id() {

        return correct_ans_id;
    }

    public String getA1_text() {
        return a1_text;
    }

    public String getA2_text() {
        return a2_text;
    }

    public String getA3_text() {
        return a3_text;
    }

    public String getA4_text() {
        return a4_text;
    }
}
