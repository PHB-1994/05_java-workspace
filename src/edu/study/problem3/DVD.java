package edu.study.problem3;

public class DVD implements Borrowable{
    private String title;
    private int 상영시간;
    private boolean 대여 = true;

    public DVD() {
    }
    public DVD(String title, int 상영시간) {
        this.title = title;
        this.상영시간 = 상영시간;
    }
    public DVD(String title, int 상영시간, boolean 대여) {
        this.title = title;
        this.상영시간 = 상영시간;
        this.대여 = 대여;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int get상영시간() {
        return 상영시간;
    }
    public void set상영시간(int 상영시간) {
        this.상영시간 = 상영시간;
    }
    public boolean is대여() {
        return 대여;
    }
    public void set대여(boolean 대여) {
        this.대여 = 대여;
    }

    @Override
    public String toString() {
        return title + " (상영시간 : " + 상영시간 + ")";
    }

    @Override
    public void borrow() {
        System.out.println(title + " DVD를 대출했습니다.");
        대여 = false;
    }

    @Override
    public void returnItem() {
        System.out.println(title + " DVD를 반납했습니다.");
        대여 = true;
    }
}
