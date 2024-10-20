package com.example.oops.principles.services;

import com.example.oops.principles.models.GradeRecord;
import com.example.oops.principles.models.Student;
import com.example.oops.principles.models.Subject;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

//    public void getStudentDetails(Student student) {
//        student.printDetails();
//    }


    public void addStudent(Student student){
        students.add(student);
    }

    public Student findStudentById(int id){
        for(Student student : students){
            if(student.getId() == id){
                return student;
            }
        }

        return null;
    }

//    public void enrollInSubject(Student student, Subject subject) {
//        student.enrollInSubject(subject);
//    }

    public List<GradeRecord> getGrades(Student student) {
        return student.getGrades();
    }


}
