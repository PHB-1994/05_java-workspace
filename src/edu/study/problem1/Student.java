package edu.study.problem1;

import java.util.*;

public class Student {

    private String name;
    private String studentId;
    private Map<String, Integer> scores = new HashMap<>();

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public Student(String name, String studentId, Map<String, Integer> scores) {
        this.name = name;
        this.studentId = studentId;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public Map<String, Integer> getScores() {
        return scores;
    }
    public void setScores(Map<String, Integer> scores) {
        this.scores = scores;
    }

    void studentScore(String studentName, int score){
        scores.put(studentName,score);
    }

    public void addScore(String studentName, int score){
        scores.put(studentName, score);
    }


}
