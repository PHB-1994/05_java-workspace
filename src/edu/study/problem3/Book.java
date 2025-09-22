package edu.study.problem3;

public class Book implements Borrowable{
    private String title;
    private String author;

    public Book() {
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " (저자 : " + author + ")";
    }

    @Override
    public void borrow() {
        System.out.println(title + " 책를 대출했습니다.");
    }

    @Override
    public void returnItem() {
        System.out.println(title + " 책를 반납했습니다.");
    }
}