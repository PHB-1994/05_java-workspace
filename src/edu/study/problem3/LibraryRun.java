package edu.study.problem3;

public class LibraryRun {
    public static void main(String[] args) {
        Library library = new Library();

        // Borrowable 인터페이스 타입으로 다양한 객체 생성
        Borrowable book1 = new Book("자바의 정석", "남궁성");
        Borrowable dvd1 = new DVD("인셉션", 148);
        Borrowable magazine1 = new Magazine("내셔널지오그래픽", "2023년 10월호");

        // 자료 추가
        library.addItem(book1);
        library.addItem(dvd1);
        library.addItem(magazine1);

        System.out.println(); // 줄바꿈

        // 전체 자료 목록 출력
        library.listAllItems();

        System.out.println(); // 줄바꿈

        // 자료 대출
        book1.borrow();
        dvd1.borrow();

        System.out.println(); // 줄바꿈

        // 특정 타입(DVD)의 대출된 자료 목록 출력
        // 실제로는 isBorrowed 상태를 확인해야 하지만, 예시에서는 대출된 항목만 필터링했다고 가정
        library.listBorrowedItemsByType(DVD.class);
    }
}