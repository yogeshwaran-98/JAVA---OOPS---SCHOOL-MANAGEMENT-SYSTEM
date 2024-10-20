package com.example.oops.principles.models;

public class PracticalExam extends Exam{

    public PracticalExam(String examName , String date , int maxMarks){
        super(examName , date ,  maxMarks);
    }

    public void conductExam() {
        System.out.println("Exam being conducted: " + examName);
    }

    @Override
    public void calculateResults() {
        System.out.println("Calculating results for : " + examName);
    }
}
