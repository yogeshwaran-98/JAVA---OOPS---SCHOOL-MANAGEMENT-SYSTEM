package com.example.oops.principles.models;

import java.util.List;

public class Teacher extends Person{


    private List<Subject> subjects;

    public Teacher(String name, int id, String address, String phoneNumber) {
        super(name, id, address, phoneNumber);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void assignSubject(Subject subject){
        subjects.add(subject);
    }



    public void assignGrade(Student student, GradeRecord grade) {
        student.addGrade(grade);
    }

    @Override
    public void printDetails() {
        System.out.println("Teacher Name: " + getName() + ", ID: " + getId() + ", Subjects: " + subjects);
    }
}
