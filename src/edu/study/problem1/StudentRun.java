package edu.study.problem1;

public class StudentRun {

    public static void main(String[] args) {
        School school = new School();

        // 학생 객체 생성
        System.out.println("=== 학생 관리 시스템 시작 ===");
        Student student1 = new Student("홍길동", "2024001");
        student1.addScore("국어", 85);
        student1.addScore("영어", 90);

        Student student2 = new Student("김철수", "2024002");
        student2.addScore("국어", 80);
        student2.addScore("영어", 95);


        // 학생 추가 (정상)
        try {
            school.addStudent(student1);
            school.addStudent(student2);

        } catch (IllegalArgumentException e) {
            System.out.println("[오류] " + e.getMessage());
        }




        // 학생 추가 (중복 학번으로 인한 예외 발생)
        Student student3 = new Student("박영희", "2024001");
        try {
            school.addStudent(student3);
        } catch (IllegalArgumentException e) {
            System.out.println("[오류] " + e.getMessage());
        }


//            System.out.println("\n=== 2024001 학생 정보 ===");
//            Student foundStudent = school.findStudentById("2024001");
//            if (foundStudent != null) {
//                System.out.println("이름: " + foundStudent.getName());
//                System.out.println("학번: " + foundStudent.getStudentId());
//                System.out.println("점수: " + foundStudent.getScores());
//            } else {
//                System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
//            }
//
//            System.out.println("\n=== 전교생 평균 ===");
//            double schoolAverage = school.calculateSchoolAverage();
//            System.out.printf("전체 평균 점수: %.1f점\n", schoolAverage);
//
//            System.out.println("\n=== 과목별 1등 ===");
//            String subjectToFind = "영어";
//            Student topStudent = school.findTopStudentForSubject(subjectToFind);
//            if (topStudent != null) {
//                System.out.println("'" + subjectToFind + "' 과목의 1등은 '" + topStudent.getName() + "' 학생입니다 (" + topStudent.getScores().get(subjectToFind) + "점).");
//            } else {
//                System.out.println("'" + subjectToFind + "' 과목의 점수를 가진 학생이 없습니다.");
//            }
    }

}

