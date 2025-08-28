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
        System.out.println();
        System.out.println("===== 도서 관리 시스템 =====");
        b.displayInfo();
        System.out.println();
        b.borrowBook("김자바");
        System.out.println();
        b.borrowBook("박코딩");
        System.out.println();
        b.returnBook("김자바");

//        System.out.println("\n=== 문제 2: 도서 관리 테스트 ===");
//
//        Book book = new Book("자바의 정석", "남궁성", "978-89-7914-726-9");
//
//        System.out.println("도서명: " + book.getTitle());
//        System.out.println("저자: " + book.getAuthor());
//        System.out.println("ISBN: " + book.getIsbn());
//        System.out.println("상태: " + (book.isAvailable() ? "대출가능" : "대출중"));
//        System.out.println();
//
//        System.out.println("김자바님이 '" + book.getTitle() + "' 대출 시도");
//        System.out.println("결과: " + book.borrowBook());
//        System.out.println();
//
//        System.out.println("박코딩님이 '" + book.getTitle() + "' 대출 시도");
//        System.out.println("결과: " + book.borrowBook());
//        System.out.println();
//
//        System.out.println("김자바님이 '" + book.getTitle() + "' 반납");
//        System.out.println("결과: " + book.returnBook());


        /**
         * 문제 3 : 카페 주문 관리 시스템
         */
        CafeOrder order1 = new CafeOrder();
        order1.setCustomerName("김자바");
        order1.setMenuItem("아메리카노");
        order1.setPrice(4000);
        order1.userInfo();
        order1.placeOrder();
        order1.printReceipt();
        System.out.println();

        CafeOrder order2 = new CafeOrder();
        order2.setCustomerName("박코딩");
        order2.setMenuItem("카페라떼");
        order2.setPrice(4500);
        order2.userInfo();
        order2.placeOrder();
        order2.printReceipt();
        System.out.println();

        System.out.println("현재 총 주문수: " + CafeOrder.totalOrders + "건");
        System.out.println("현재 총 매출: " + String.format("%,d", CafeOrder.totalSales) + "원");


    }


}
