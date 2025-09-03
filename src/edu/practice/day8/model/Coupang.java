package edu.practice.day8.model;

public class Coupang implements OnlineShopping {
    // 필드
    private String item;

    // 생성자
    public Coupang(String item) {
        this.item = item;
    }

    // getter setter

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    // 메서드
    @Override
    public void browse() {
        System.out.println("🔍 쿠팡에서 {" + getItem() + "}을(를) 둘러봅니다.");
    }

    @Override
    public void addToCart() {
        System.out.println("🛒 {" + getItem() + "}을(를) 쿠팡 장바구니에 쏙!");
    }

    @Override
    public void purchase() {
        System.out.println("💳 쿠팡에서 {" + getItem() + "} 주문! 로켓배송으로 내일 도착!");
    }
}
