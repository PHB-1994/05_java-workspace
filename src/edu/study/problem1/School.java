package edu.study.problem1;

import java.util.*;

public class School {

    private List<String> students = new ArrayList<>();

    public void 입력받기(){
//        while(true){
//            System.out.println("학생 정보를 등록합니다 (종료를 입력하면 종료됩니다)");
//
//            System.out.print("이름을 입력하세요 : ");
//            String name = sc.nextLine();
//
//            if(students.contains(name)){
//                System.out.println("중복된 이름입니다. 다시 입력해주세요");
//                return;
//            }
//
//            if(name.equals("종료")){
//                break;
//            }
//
//            System.out.print("학번을 입력하세요 : ");
//            String studentId = sc.nextLine();
//
//            System.out.print("국어 점수를 입력하세요 : ");
//            int kor = sc.nextInt();
//            sc.nextLine();
//
//            System.out.print("영어 점수를 입력하세요 : ");
//            int eng = sc.nextInt();
//            sc.nextLine();
//
//            System.out.print("수학 점수를 입력하세요 : ");
//            int math = sc.nextInt();
//            sc.nextLine();
//
//            students.add(name);
////            students.add(name + "," + studentId + "," + kor + "," + eng + "," + math);
//
//        }

    }

    public void addStudent(Student studentId) {
        try{
            if(students.contains(studentId.getStudentId())){
                throw new IllegalArgumentException("이미 존재하는 학번입니다.");

            } else {
                students.add(studentId.getName());
                students.add(studentId.getStudentId());
            }

            System.out.println(studentId.getName() + "(" + studentId.getStudentId() + ") 학생 정보가 추가되었습니다.");

        } catch(IllegalArgumentException e){
            System.out.println("중복된 학번입니다. 다시 입력해주세요");

        } catch (Exception e){
            System.out.println("예기치 못한 오류 발생!");
        }
    }

    public void findStudentById(String studentId){}

    public void calculateSchoolAverage(){

    }

    public void findTopStudentForSubject(){}

    /*
     * Run 에서 System.out.println("[오류] " + e.getMessage()); 어떻게 실행되는지???
     *
     * */
}