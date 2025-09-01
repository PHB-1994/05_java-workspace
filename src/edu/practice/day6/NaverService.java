package edu.practice.day6;

/**
 * 부모 클래스
 * 모든 네이버의 공통 기능을 제공하는 부모 클래스
 */
public class NaverService {
    protected String serviceName;   // 쇼핑, 블로그, 카페와 같은 서비스 명칭
    protected String userId;        // 유저 아이디
    protected String userNickname;  // 유저 닉네임
    protected int userLevel;        // 유저 레벨

    // 기본 생성자
    public NaverService() {
    }

    // 매개변수 생성자
    public NaverService(String serviceName, String userId, String userNickname, int userLevel) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.userLevel = userLevel;
    }

    // getter setter
    public String getServiceName() { return serviceName; }
    public String getUserId() { return userId; }
    public String getUserNickname() { return userNickname; }
    public int getUserLevel() { return userLevel; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }
    public void setUserId(String userId) { this.userId = userId; }
    public void setUserNickname(String userNickname) { this.userNickname = userNickname; }
    public void setUserLevel(int userLevel) { this.userLevel = userLevel; }

    // 공통 메서드
    public void login() {
        System.out.println(getUserNickname() + "님이 " + getServiceName() + "에 로그인했습니다.");
    }

    public void logout() {
        System.out.println(getUserNickname() + "님이 " + getServiceName() + "에서 로그아웃했습니다.");
    }

    public void showUserInfo(){
        System.out.println(" === 가입 정보 === ");
        System.out.println("서비스 폼 : " + getServiceName());
        System.out.println("유저 아이디 : " + getUserId());
        System.out.println("유저 닉네임 : " + getUserNickname());
        System.out.println("유저 레벨 : " + getUserLevel());
    }
    
    // 오버라이딩 대상 메서드
    public void search() {
        System.out.println("상품을 검색합니다.");
    }

    public void writeContent() {
        System.out.println("리뷰를 작성합니다.");
    }




}
