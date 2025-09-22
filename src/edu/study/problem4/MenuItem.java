package edu.study.problem4;

public class MenuItem {

    protected String 메뉴명;
    protected int 가격;
    protected String 카테고리;

    public MenuItem() {
    }
    public MenuItem(String 메뉴명, int 가격, String 카테고리) {
        this.메뉴명 = 메뉴명;
        this.가격 = 가격;
        this.카테고리 = 카테고리;
    }

    public String get메뉴명() {
        return 메뉴명;
    }
    public void set메뉴명(String 메뉴명) {
        this.메뉴명 = 메뉴명;
    }
    public int get가격() {
        return 가격;
    }
    public void set가격(int 가격) {
        this.가격 = 가격;
    }
    public String get카테고리() {
        return 카테고리;
    }
    public void set카테고리(String 카테고리) {
        this.카테고리 = 카테고리;
    }

    @Override
    public String toString() {
        return 메뉴명 + " (" + 카테고리 + ") - " + 가격 + "원";
    }
}