package edu.study.problem3;

public class Magazine implements Borrowable{
    private String title;
    private String 발행일;

    public Magazine() {
    }
    public Magazine(String title, String 발행일) {
        this.title = title;
        this.발행일 = 발행일;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String get발행일() {
        return 발행일;
    }
    public void set발행일(String 발행일) {
        this.발행일 = 발행일;
    }


    @Override
    public String toString() {
        return title + " (발행일 : " + 발행일 + ")";
    }

    @Override
    public void borrow() {
        System.out.println(title + " 잡지를 대출했습니다.");
    }

    @Override
    public void returnItem() {
        System.out.println(title + " 잡지를 반납했습니다.");
    }
}

