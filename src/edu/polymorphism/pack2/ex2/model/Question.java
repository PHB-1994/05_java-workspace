package edu.polymorphism.pack2.ex2.model;

public class Question extends Post{
    // 필드
    private int answerCount; // 답변 개수 (초기값 0)

    // 생성자
    public Question() {
    }
    public Question(String postId, String title, String author, String content) {
        super(postId, title, author, content);
        this.answerCount = 0; // answerCount 응답개수의 경우 소비자한테 전달 받는 것이 아닌 개발자가 첫 응답개수를 지정
    }

    // getter setter
    public int getAnswerCount() {
        return answerCount;
    }
    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    // Post 클래스에서 강제로 작성해야하는 메서드만 필히 작성하기!!
    @Override
    public void dispalyPost() {
        System.out.println(
                "[Q&A] {" + getTitle() + "} 작성자 : {" + getAuthor() + "} 답변 개수 : {" + getAnswerCount() +"}개 내용 : {"+ getContent() + "}");
    }

    public void addAnswer(){
        answerCount++;
    }


}
