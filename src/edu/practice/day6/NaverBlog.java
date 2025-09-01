package edu.practice.day6;

public class NaverBlog extends NaverService{
    // 고유 필드 인스턴스 변수
    private int postCount;
    private int visitorCount;

    // 기본 생성자
    public NaverBlog() {
        super();
    }

    // 매개변수 4개 생성자
    public NaverBlog(String serviceName, String userId, String userNickname, int userLevel) {
        super(serviceName, userId, userNickname, userLevel);
    }

    // 매개변수 6개 생성자
    public NaverBlog(String serviceName, String userId, String userNickname, int userLevel,int postCount,int visitorCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.postCount = postCount;
        this.visitorCount = visitorCount;
    }

    // getter setter
    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    public int getVisitorCount() {
        return visitorCount;
    }

    public void setVisitorCount(int visitorCount) {
        this.visitorCount = visitorCount;
    }

    // 공통 메서드
    @Override
    public void search() {
        System.out.println("블로그에서 포스트를 검색합니다.");
    }

    @Override
    public void writeContent() {
        System.out.println("블로그 포스트를 작성합니다.");
    }

    // 고유 메서드
    public void addNeighbor(){
        System.out.println(getUserNickname() + " 님의 이웃이 추가되었습니다.");
        postCount++;
        visitorCount++;
    }

    public void customizeTheme(){
        System.out.println(getUserNickname() + " 님의 테마가 변경되었습니다.");
    }


}
