package edu.oop.method.ex;

/**
 * 도서관 회원 속성 정의 클래스
 */
public class LibraryMember {

    // static 공유 정보
    public static int totalMemberCount;
    public static int currentVisitorCount;

    // static final 상수
    public static final String LIBRARY_NAME = "스마트 도서관";
    public static final String OPENING_HOURS = "09:00 - 22:00";
    public static final int MAX_BORROW_BOOKS = 10;
    public static final int MIN_AGE_LIMIT = 14;

    // 인스턴스 변수
    private String membershipId;
    private String memberName;
    private String phoneNumber;
    private int borrowedBooks;
    private int age;
}
