package edu.practice.day3;

public class Practice4 {

    private String name;                     // 학생명
    private int studentId;                   // 학번
    private int[] scores = new int[5];       // 과목별 점수 배열, 5과목
    private String[] subjects;               // 과목명 배열 : "국어", "영어", "수학", "과학", "사회"


    // 기본 생성자
    public Practice4() {
    }

    // 필수 생성자
    public Practice4(String name, int studentId, String[] subjects) {
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

        System.out.print(getScores() + " 점수: ");
    }


    /**
     * 총점 계산
     * @return 총점
     */


    /**
    * 평균 계산
    * @return 평균
    */

    /**
    * 학점 계산
    * @return 학점 (A, B, C, D, F)
    */


    /**
     * 성적표 출력
     */


}
