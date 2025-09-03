package edu.polymorphism.pack3.ex1;

/**
 *
 * Meta플랫폼 클래스 -> 추상 클래스로 작성하면
 */
/*
public interface 소셜미디어기능들(){}
public class Meta플랫폼(){}

추상존재하지 않고,                  부모 클래스 + 인터페이스의 조합
public class Instagram extends Meta플랫폼 implements 소셜미디어기능들{}

public class Meta플랫폼(){}
추상기능이 존재하고,                 부모 클래스에 abstract 를 활용한 조합
public class Instagram implements 소셜미디어기능들{}
 */
public class Instagram extends Meta플랫폼 /* implements 소셜미디어기능들 */{
    public Instagram(String 유저아이디) {
        super("Instagram", 유저아이디);
    }

    @Override
    public void post(String content) {
        System.out.println("[Instagram] 릴스 게시물 : " + content);
    }

    @Override
    public void like(String postId) {
        System.out.println("[Instagram] 게시물 : " + postId + " 에 하트를 눌렀습니다.");
    }

}
