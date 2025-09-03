package edu.practice.day8.model;

public class TikTok implements VideoPlayer {
    // 필드
    private String creator;

    // 생성자
    public TikTok(String creator) {
        this.creator = creator;
    }

    // getter setter
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    // 메서드
    @Override
    public void upload() {
        System.out.println("🎵 {" + getCreator() + "}님이 틱톡에 숏폼 영상을 올립니다!");
    }

    @Override
    public void play() {
        System.out.println("▶️ {" + getCreator() + "}님의 틱톡 영상 재생 중! 중독성 있어요~");
    }

    @Override
    public void pause() {
        System.out.println("⏸️ 틱톡 영상을 잠시 멈춥니다.");
    }
}
