package com.example.oops.principles.services;

import com.example.oops.principles.models.Subject;
import com.example.oops.principles.models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    private List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getAllTeachers(){
        return teachers;
    }

//    public void getTeacherDetails(Teacher teacher) {
//        teacher.printDetails();
//    }


    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

//    public void assignSubjectToTeacher(Subject subject , Teacher teacher){
//        teacher.assignSubject(subject);
//    }

    public List<Subject> getSubjects(Teacher teacher){
        return teacher.getSubjects();
    }
}
