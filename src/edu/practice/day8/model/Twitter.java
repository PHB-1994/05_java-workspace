package edu.practice.day8.model;

public class Twitter implements SocialMedia{
    // 필드
    private String tweet;

    // 생성자
    public Twitter(String tweet) {
        this.tweet = tweet;
    }

    // getter setter
    public String getTweet() {
        return tweet;
    }
    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    // 메서드
    public void post(){
        System.out.println("🐦 트위터에 트윗합니다: {" + getTweet() + "}");
    }

    public void like(){
        System.out.println("❤️ 트윗에 좋아요를 눌렀습니다!");
    }

    public void share(){
        System.out.println("🔄 리트윗했습니다!");
    }
}
