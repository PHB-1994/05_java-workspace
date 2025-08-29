package edu.oop.method;

public class StudentRun {
    public static void main(String[] args) {
        // StudentService ss = new StudentService();
        // ss.disaplayMenu();

        // 생성된 StudentService 객체를
        // ss 라는 공간에 담아서 지속적으로 사용하는 것이 아니라
        // 1번 사용하고 메모리에서 지워버림
        new StudentService().disaplayMenu();
    }
}
