package edu.inheritance.ex2;

public class Motorcycle extends Vehicle {
    private int engineSize;
    private boolean hasHelmet;

    // 기본 생성자
    public Motorcycle() {
        super();
    }

    // 매개변수 4개 생성자
    public Motorcycle(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    // 매개변수 6개 생성자
    public Motorcycle(String brand, String model, int year, String color, int engineSize, boolean hasHelmet) {
        super(brand, model, year, color);
        this.engineSize = engineSize;
        this.hasHelmet = hasHelmet;
    }

    public int getEngineSize() {
        return engineSize;
    }
    public void setEngineSize(int engineSize) {}

    @Override
    public void accelerate() {
        System.out.println("오토바이가 스로틀을 돌려 가속합니다.");
    }

    @Override
    public void brake() {
        System.out.println("오토바이가 브레이크 레버를 당겨 감속합니다.");
    }

    // Motorcycle 클래스 안에서만 사용하는 메서드
    public void wheelie(){
        System.out.println(getBrand() + getModel() + "이(가) 앞바퀴를 들고 윌리를 합니다!");
    }

    public void putOnHelmet(){
        System.out.println(getBrand() + getModel() + "이(가) 안전을 위해 헬멧을 착용합니다.");
    }

}
