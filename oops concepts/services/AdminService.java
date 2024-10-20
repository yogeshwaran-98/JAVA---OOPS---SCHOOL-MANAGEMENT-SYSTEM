package com.example.oops.principles.services;

import com.example.oops.principles.models.*;

public class AdminService {

    private Admin admin;

    public void enrollInSubject(Student student, Subject subject) {
       admin.enrollStudentInSubject(student , subject);
    }

    public void assignSubjectToTeacher(Teacher teacher , Subject subject){
        admin.assignSubjectToTeacher(teacher , subject);
   }

    public void getDetails(Person person){
        person.printDetails();
    }


}
