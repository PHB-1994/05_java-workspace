package edu.inheritance.ex2;

public class Bicycle extends Vehicle{

    private int gearCount;
    private boolean isElectric;

    // 기본 생성자
    public Bicycle() {
        super();
    }

    // 매개변수 4개 생성자
    public Bicycle(String brand, String model, int year, String color){
        super(brand, model, year, color);
    }

    public Bicycle(String brand, String model, int year, String color,int gearCount, boolean isElectric) {
        super(brand, model, year, color);
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    // getter setter
    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public void accelerate() {
        System.out.println("자전거가 페달을 밟아 가속합니다.");
    }

    @Override
    public void brake() {
        System.out.println("자전거가 브레이크를 잡아 감속합니다.");
    }

    // Bicycle 클래스 안에서만 사용하는 메서드
    public void ringBell(){

    }

    public void pedal(){

    }


}
