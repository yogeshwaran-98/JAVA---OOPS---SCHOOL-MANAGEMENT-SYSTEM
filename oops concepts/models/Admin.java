package com.example.oops.principles.models;

public class Admin extends Person{

    public Admin(String name, int id, String address, String phoneNumber) {
        super(name, id, address, phoneNumber);
    }

    public void assignSubjectToTeacher(Teacher teacher, Subject subject) {
        teacher.assignSubject(subject);
    }

    public void enrollStudentInSubject(Student student, Subject subject) {
        student.enrollInSubject(subject);
    }

    public void getDetails(Person person){
        person.printDetails();
    }


}
