package edu.practice.day6;

public class NaverShopping extends NaverService{
    // 필드 인스턴스 변수
    private int point;
    private int cartCount;

    // 기본 생성자
    public NaverShopping() {
        super();
    }

    // 매개변수 4개 생성자
    public NaverShopping(String serviceName, String userId, String userNickname, int userLevel) {
        super(serviceName, userId, userNickname, userLevel);
    }

    // 매개변수 6개 생성자
    public NaverShopping(String serviceName, String userId, String userNickname, int userLevel, int point, int cartCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.point = point;
        this.cartCount = cartCount;
    }

    // getter setter
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getCartCount() {
        return cartCount;
    }

    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }

    // 공통 메서드
    @Override
    public void search() {
        System.out.println("쇼핑몰에서 상품을 검색합니다.");
    }

    @Override
    public void writeContent() {
        System.out.println("상품 리뷰를 작성합니다.");
    }

    // 고유 메서드
    public void addToCart(){
        System.out.println("카트에 제품을 담았습니다.");
        cartCount++;
    }

    public void buyProduct(){
        System.out.println("제품을 구매했습니다.");
        point++;
    }
}
