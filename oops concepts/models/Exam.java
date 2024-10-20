package com.example.oops.principles.models;

public abstract class Exam {

    protected String examName ;
    protected String date;
    protected int maxMarks;

    public Exam(String examName , String date , int maxMarks){
        this.examName = examName;
        this.date = date;
        this.maxMarks = maxMarks;
    }

    public abstract void conductExam();
    public abstract void calculateResults();
}
