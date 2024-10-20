package com.example.oops.principles.models;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private List<Subject> subjects = new ArrayList<>();
    private List<GradeRecord> grades = new ArrayList<>();


    public Student(String name , int id , String address , String phoneNumber){
        super(name , id , address , phoneNumber);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<GradeRecord> getGrades() {
        return grades;
    }

    public void enrollInSubject(Subject subject) {
        subjects.add(subject);
    }

    public void addGrade(GradeRecord gradeRecord) {
        grades.add(gradeRecord);
    }

    public List<GradeRecord> getGradesForSubject(Subject subject){
        List<GradeRecord> gradesForSubject = new ArrayList<>();

        for(GradeRecord grade : grades){
            if(grade.getSubject().equals(subject)){
                gradesForSubject.add(grade);
            }
        }

        return gradesForSubject;
    }

    @Override
    public void printDetails() {
        System.out.println("Student Name: " + getName() + ", ID: " + getId() + ", Subjects: " + subjects);
    }



}
