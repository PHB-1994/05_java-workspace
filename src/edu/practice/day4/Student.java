package edu.practice.day4;

public class Student {


    private String name;
    private String studentId;
    private int score;

    // 기본 생성자
    public Student() {
    }

    // 필수 생성자
    public Student(String name, String studentId, int score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getScore() {
        return score;
    }

//    public void displayInfo(){
//        System.out.println("===== 학생 정보 관리 시스템 =====");
//        System.out.println("학생명 : " + getName());
//        System.out.println("학번 : " + getStudentId());
//        System.out.println("점수 : " + getScore());
//        isPass();
//    }

//    public void isPass(){
//        if(getScore() >= 60){
//            System.out.println("결과 : 합격"); // 각각의 결과를 return 으로 반환
//        }else {
//            System.out.println("결과 : 불합격"); // 각각의 결과를 return 으로 반환
//        }
//
//    }

    public void displayInfo(){

        System.out.printf("\n===== 학생 정보 관리 시스템 =====\n" +
                " * 학생명 : %s\n" +
                " * 학번 : %s\n" +
                " * 점수 : %d점\n",getName(),getStudentId(),getScore());
        System.out.println(" * 결과 : " + isPass());

        // 같은 클래스 내에서 메서드를 호출할 때
        // 클래스 명칭이나 객체 변수명칭을 생략하고 호출할 수 있다.
        // return 값이 존재할 때
    }

    public String isPass(){
        /*
        if(score >= 60){
            return "합격";
        }else {
            return "불합격";
         */
        return (score >= 60) ? "합격" : "불합격";

    }

}
