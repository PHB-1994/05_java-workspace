package edu.practice.day4;

public class CafeOrder {

    public static int totalOrders; // 전체 주문 수
    public static int totalSales;  // 총 매출

    public static final String CAFE_NAME = "코딩카페";
    public static final double TAX_RATE = 0.1;

    private String customerName;
    private String menuItem;
    private int price;
    private int orderNumber;

    static{
        totalOrders=0;
        totalSales=0;
        System.out.println("===" + CAFE_NAME + "시스템 시작 ===");
    }

    // 기본 생성자
    public CafeOrder() {
    }

    // setter
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    // getter
    public String getCustomerName() {
        return customerName;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public int getPrice() {
        return price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void userInfo(){
        totalOrders++;
        System.out.println("===== 코딩카페 영수증 =====");
        System.out.println("주문번호 : " + totalOrders);
        System.out.println("고객명 : " + getCustomerName());
        System.out.println("메뉴 : " + getMenuItem());
        System.out.println("가격 : " + getPrice());
    }

    int totalMoney;

    public void placeOrder(){
        int money = (int)(getPrice() * TAX_RATE);
        System.out.println("세금 : " + money + "원");
    }

    public void printReceipt(){
        int money = (int)(getPrice() * TAX_RATE);
        totalMoney = money + getPrice();
        totalSales += totalMoney;
        System.out.println("총액 : " + totalMoney + "원");
        System.out.println("========================");
    }
}
