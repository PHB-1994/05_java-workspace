package edu.practice.day4;

public class PracticeRun {

    public static void main(String[] args) {

        /**
         * 문제 1 : 학생 정보 관리 클래스
         * */
        Student p1 = new Student("김자바","2024001",85);
        p1.setName("김자바");
        p1.setStudentId("2024001");
        p1.setScore(85);
        Student p2 = new Student("박코딩","2024002",45);


        p1.displayInfo();
        System.out.println();
        p2.displayInfo();



        /**
         * 문제 2 : 도서관 도서 관리 클래스
         */
        Book b = new Book("자바의 정석", "남궁성","978-89-7914-726-9");

    }
}
