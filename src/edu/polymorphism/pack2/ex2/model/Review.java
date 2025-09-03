package edu.polymorphism.pack2.ex2.model;

public class Review extends Post{
    // 필드
    private int rating; // 평전 (1-5점)

    // 생성자
    public Review() {
    }
    public Review(String postId, String title, String author, String content) {
        super(postId, title, author, content);
    }
    public Review(int rating) {
        this.rating = rating;
    }
    public Review(String postId, String title, String author, String content, int rating) {
        super(postId, title, author, content);
        this.rating = rating;
    }

    // getter
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    // 메서드
    @Override
    public void dispalyPost() {
        System.out.println(
                "[후기] {" + getTitle() + "} 작성자 : {" + getAuthor() + "} 평점 : {" + getRating() +"}/5점 내용 : {"+ getContent() + "}");
    }

}
