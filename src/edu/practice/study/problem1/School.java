package edu.practice.study.problem1;

import java.util.*;

public class School {

    private List<Student> students = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void addStudent(){
        System.out.print("학생 정보를 등록합니다");

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("학번을 입력하세요 : ");
        String studentId = sc.nextLine();

        System.out.print("국어 점수를 입력하세요 : ");
        String kor = sc.nextLine();

        System.out.print("영어 점수를 입력하세요 : ");
        String eng = sc.nextLine();

        System.out.print("수학 점수를 입력하세요 : ");
        String math = sc.nextLine();



    }

    public void findStudentById(){

    }

    public void calculateSchoolAverage(){

    }

    public void findTopStudentForSubject(){}

}
