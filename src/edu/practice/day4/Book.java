package edu.practice.day4;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;


    {
        title = "자바의 정석";
        author = "남궁성";
        isbn = "978-89-7914-726-9";
        isAvailable = true;
    }

    // 기본 생성자
    public Book() {
    }

    // 필수 생성자
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook(String name){
        System.out.println(name + "님이 " + getTitle() + "대출 시도");
        if(isAvailable){
            System.out.println("결과 : 대출 성공");
        }else {
            System.out.println("결과 : 이미 대출 중");
        }
    }

    public void returnBook(String name){

    }
}
