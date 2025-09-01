package edu.inheritance.ex;

// 새 클래스
class Bird extends Animal{
    // 필드 속성 인스턴스 변수
    private double wingspan;

    public Bird(String name, int age, String color) {
        super(name, age, color);
    }


    // 매개변수 생성자 Animal 3개                       bird 1개
    public Bird(String name, int age, String color,double wingspan) {
        super(name, age, color);
        this.wingspan = wingspan;
    }

    // 게터 : set 이나 wingspan 에 저장된 데이터를 사용할 수 있는 기능
    public double getWingspan() {
        return wingspan;
    }
    // 세터 : DB 에 저장하기 전에 임시로 데이터를 보유하고 있는 기능
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override   // Animal 클래스에 작성한 기능 재사용
    public void makeSound() {
        System.out.println(getName() + "이(가) 짹짹 웁니다.");
    }

    @Override   // Animal 클래스에 작성한 기능 재사용
    public void move() {
        System.out.println(getName() + "이(가) 날아다닙니다.");
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("날개 길이 : " + getWingspan());
    }


    // Bird 에서만 사용할 수 있는 기능들
    public void fly(){
        System.out.println(getName() + "이(가) 높이 날아오릅니다!");
    }

    public void buildNest(){
        System.out.println(getName() + "이(가) 둥지를 만듭니다!");
    }


}