package edu.practice.day8.model;

public class KakaoTalk implements Messenger{
    // 필드
    private String friend;

    // 생성자

    public KakaoTalk(String friend) {
        this.friend = friend;
    }

    // getter setter

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    @Override
    public void sendMessage() {
        System.out.println("💬 {" + getFriend() + "}님에게 카톡을 보냅니다! 노란색 말풍선~");
    }

    @Override
    public void receiveMessage() {
        System.out.println("📱 {" + getFriend() + "}님으로부터 카톡이 왔어요! 톡톡~");
    }

    @Override
    public void makeCall() {
        System.out.println( "📞 {" + getFriend() + "}님과 카톡 보이스톡 연결!");
    }
}
