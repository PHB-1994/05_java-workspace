package edu.oop.method.ex;

/**
 * 실행용 메인 클래스
 */
public class LibraryRun {
    public static void main(String[] args) {
        new LibraryService().displayMenu();

        LibraryMember member1 = new LibraryMember("LIB001","김독서", "010-1111-2222",25);
    }
}