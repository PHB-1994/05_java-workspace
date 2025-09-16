package edu.practice.study.problem1;

import java.util.*;

public class School {

    private List<String> students = new ArrayList<String>();

    Scanner sc = new Scanner(System.in);

    public void addStudent(){

        while(true){
            System.out.println("학생 정보를 등록합니다 (종료를 입력하면 종료됩니다)");

            System.out.print("이름을 입력하세요 : ");
            String name = sc.nextLine();

            if(students.contains(name)){
                System.out.println("중복된 이름입니다. 다시 입력해주세요");
                return;
            }

            if(name.equals("종료")){
                break;
            }

            System.out.print("학번을 입력하세요 : ");
            String studentId = sc.nextLine();

            System.out.print("국어 점수를 입력하세요 : ");
            int kor = sc.nextInt();
            sc.nextLine();

            System.out.print("영어 점수를 입력하세요 : ");
            int eng = sc.nextInt();
            sc.nextLine();

            System.out.print("수학 점수를 입력하세요 : ");
            int math = sc.nextInt();
            sc.nextLine();


        }




    }

    public void findStudentById(){

    }

    public void calculateSchoolAverage(){

    }

    public void findTopStudentForSubject(){}

}
