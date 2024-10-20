package com.example.oops.principles.models;

public class GradeRecord {

    private Subject subject;
    private double grade;
    private Student student;

    public GradeRecord(Subject subject , double grade , Student student){
        this.subject = subject;
        this.grade = grade;
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
