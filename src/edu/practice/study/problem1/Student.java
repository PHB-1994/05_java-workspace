package edu.practice.study.problem1;

import java.util.*;

public class Student {
    // 필드
    private String name;
    private String studentId;
    private Map<String, Integer> scores = new HashMap<>();


    // 생성자
    public Student() {
    }
    public Student(String name, String studentId, List<Student> students) {
        this.name = name;
        this.studentId = studentId;
        this.students = students;
    }

    // 게터 세터
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
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
