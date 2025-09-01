package edu.practice.day6;

public class NaverCafe extends NaverShopping{
    // 고유 필드 인스턴스 변수
    private String cafeGrade;
    private int articleCount;

    // 기본 생성자
    public NaverCafe() {
        super();
    }

    // 매개변수 4개 생성자
    public NaverCafe(String serviceName, String userId, String userNickname, int userLevel) {
        super(serviceName, userId, userNickname, userLevel);
    }

    // 매개변수 6개 생성자
    public NaverCafe(String serviceName, String userId, String userNickname, int userLevel,String cafeGrade,int articleCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.cafeGrade=cafeGrade;
        this.articleCount=articleCount;
    }

    // getter setter
    public String getCafeGrade() {
        return cafeGrade;
    }

    public void setCafeGrade(String cafeGrade) {
        this.cafeGrade = cafeGrade;
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }


    // 공통 메서드
    @Override
    public void search() {
        System.out.println("카페에서 게시글을 검색합니다.");
    }

    @Override
    public void writeContent() {
        System.out.println("카페 게시글을 작성합니다.");
    }

    // 고유 메서드
    public void joinCafe(){
        System.out.println(getUserNickname() + " 님의 가입을 환영합니다. 현재 가입 등급은 " + getCafeGrade() + "입니다.");

    }

    public void uploadFile(){
        System.out.println(getUserNickname() + " 님의 파일이 업로드 되었습니다.");
        articleCount++;
    }

}
