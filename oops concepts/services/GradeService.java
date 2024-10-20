package com.example.oops.principles.services;

import com.example.oops.principles.models.GradeRecord;
import com.example.oops.principles.models.Student;
import com.example.oops.principles.models.Subject;
import com.example.oops.principles.utility.GradeCalculator;

import java.util.List;

public class GradeService {

    public void assignGrade(Student student , GradeRecord grade ){
        student.addGrade(grade);
    }

    public List<GradeRecord> getGradesForSubject(Student student , Subject subject){
        return student.getGradesForSubject(subject);
    }

    public double calculateAverageGrade(Student student) {
        return GradeCalculator.calculateAverage(student.getGrades());
    }
}
