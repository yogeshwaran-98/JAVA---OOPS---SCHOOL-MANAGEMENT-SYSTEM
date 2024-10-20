package com.example.oops.principles.models;

public class WrittenExam extends Exam{

    public WrittenExam(String examName, String date, int maxMarks) {
        super(examName, date, maxMarks);
    }

    @Override
    public void conductExam() {
        System.out.println("Exam being conducted: " + examName);
    }

    @Override
    public void calculateResults() {
        System.out.println("Calculating results for : " + examName);
    }
}
