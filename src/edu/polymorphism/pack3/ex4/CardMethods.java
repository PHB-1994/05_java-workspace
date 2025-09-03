package edu.polymorphism.pack3.ex4;
// 추상클래스로 CreditCard 에 작성된 추상 메서드를 인터페이스로 옮겨 작성한 후
// 추상메서드가 아닌 인터페이스 CardMethods 를 활용하여 문제 없이 동작하도록 설정
public interface CardMethods {

    // 포인트 적립률
    void showBenefits();        // 혜택 안내
    int calculateDiscount(int amount); // 할인 계산
    int getPointRate();
}
