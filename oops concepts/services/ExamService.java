package com.example.oops.principles.services;

import com.example.oops.principles.models.Exam;

import java.util.ArrayList;
import java.util.List;

public class ExamService {

    private List<Exam> exams = new ArrayList<>();

    public void addExam(Exam exam){
        exams.add(exam);
    }

    public List<Exam> getAllExams(){
        return exams;
    }

    public void conductExam(Exam exam){
        exam.conductExam();
    }

    public void calculateResults(Exam exam){
        exam.calculateResults();
    }
}
