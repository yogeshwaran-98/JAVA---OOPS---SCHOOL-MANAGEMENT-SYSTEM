package com.example.oops.principles.utility;

import com.example.oops.principles.models.GradeRecord;

import java.util.List;

public class GradeCalculator {

    public  static double calculateAverage(List<GradeRecord> grades){
        double total =0;

        for(GradeRecord grade : grades){
            total+= grade.getGrade();
        }

        return total/grades.size();
    }
}
