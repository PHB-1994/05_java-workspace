package edu.practice.day3;

import java.util.Scanner;

public class Student {

    private String name;                     // 학생명
    private int studentId;                   // 학번
    private int[] scores = new int[5];       // 과목별 점수 배열, 5과목
    private String[] subjects;               // 과목명 배열 : "국어", "영어", "수학", "과학", "사회"


    Scanner sc = new Scanner(System.in);
    // 기본 생성자
    public Student() {
        this.subjects = new String[]{"국어", "영어", "수학", "과학", "사회"};
    }

    // 필수 생성자
    public Student(String name, int studentId, String[] subjects) {
        this.name = name;
        this.studentId = studentId;
        this.subjects = subjects;
    }



    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int[] getScores() {
        return scores;
    }

    public String[] getSubjects() {
        return subjects;
    }



    public void inputScores() {
        System.out.println("=== " + getName() + " 학생 성적 입력 ===");

        for(int i = 0; i < scores.length; i++) {
            System.out.print(subjects[i] + " 점수: ");
            scores[i] = sc.nextInt();
        }
//        System.out.println(scores[0]);
//        System.out.println(scores[1]);
//        System.out.println(scores[2]);
//        System.out.println(scores[3]);
//        System.out.println(scores[4]);
    }

    /**
     * 총점 계산
     * @return 총점
     */
    public int getTotalScore() {

        int totalScores = 0;

        for (int i = 0; i < scores.length; i++) {
            totalScores += scores[i];
//            System.out.println("값 확인 : " + totalScores);
        }
        return totalScores;
    }


    /**
     * 평균 계산
     * @return 평균
     */
    public double getAverage(){
//        double average = (double) getTotalScore() / scores.length;
        return (double) getTotalScore() / scores.length;
    }

    /**
     * 학점 계산
     * @return 학점 (A, B, C, D, F)
     */
    public String getGrade(){
        if(getAverage() >= 90){
            return "A";
        }else if(getAverage() >= 80){
            return "B";
        }else if(getAverage() >= 70){
            return "C";
        }else if(getAverage() >= 60){
            return "D";
        }else {
            return "F";
        }
    }


    /**
     * 성적표 출력
     */
    public void printReport(){
        System.out.println("\n=== " + this.name + "(" + this.studentId + ") 성적표 ===");

        for(int i = 0; i < scores.length; i++) {
            System.out.println(subjects[i] + ": " + scores[i] + "점");
        }

        System.out.println("-----------------------");
        System.out.println("총점: " + getTotalScore() + "점");
        System.out.printf("평균: %.1f점\n", getAverage());
        System.out.println("학점: " + getGrade());
    }


}

