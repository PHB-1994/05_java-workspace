package edu.practice.day3;

public class Car {


    private String brand;               // 브랜드
    private String model;               // 모델명
    private int fuel;                   // 연료랑, 0 ~ 100
    private int speed = 0;                  // 현재 속도, 기본값 0
    private boolean isEngineOn = false; // 엔진 상태, 기본값 false
    private int totalDistance = 0;          // 총 주행거리, 기본값 0

    // 기본 생성자
    public Car() {
    }

    // 필수 생성자
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.fuel = 100;
    }

    // setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    // getter
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public void method5(){
        carInfo();
        startEngine();
        accelerate(50);
        drive(500);
        carInfo();
        refuel(32);
        brake(10);
        carInfo();
        stopEngine();
        startEngine();
        accelerate(50);
        drive(820);
    }

    /**
     * 차 정보
     */
    public void carInfo(){
        System.out.println("=== 자동차 정보 ===");
        System.out.println("브랜드 : " + getBrand());
        System.out.println("모델 : " + getModel());
        System.out.println("연료량 : " + getFuel() + "L");
        System.out.println("속도 : " + getSpeed() + "km/h");
        System.out.println("엔진상태 : " + (isEngineOn()? "on" : "off"));
        System.out.println("총 주행거리 : " + getTotalDistance() + "km");
        System.out.println();
    }

    /**
     * 엔진 시동
     */
    public void startEngine(){
        if(isEngineOn){
            System.out.println("이미 시동이 걸려있습니다.\n");
        }else {
            System.out.println(getModel() + " 엔진이 시동되었습니다.\n");
            isEngineOn = true;
        }
        if(fuel == 0){
            System.out.println("연료가 부족하여 시동을 걸 수 없습니다.\n");
            stopEngine();
        }
    }

    /**
     * 엔진 정지
     */
    public void stopEngine(){
        System.out.println(getModel() + " 엔진이 정지되었습니다.\n");
        isEngineOn = false;
    }

    /**
     * 가속
     * @param speedUp 올릴 속도
     */
    public void accelerate(int speedUp){
        if(!isEngineOn){
            System.out.println("엔진이 꺼져있어 가속할 수 없습니다.\n");
        }

        if(fuel == 0){
            System.out.println("연료가 없어 가속할 수 없습니다.\n");
        }else {
            System.out.println(speedUp + "km/h로 가속했습니다. 현재 속도: " + speedUp + "km/h\n");
            speed += speedUp;
        }
    }

    /**
     * 감속
     * @param speedDown 내릴 속도
     */
    public void brake(int speedDown){
        speed -= speedDown;
        System.out.println(speedDown + "km/h로 감속했습니다. 현재 속도: " + speed + "km/h\n");
    }

    /**
     * 주유
     * @param amount 주유할 연료량
     */
    public void refuel(int amount){
        fuel += amount;
        System.out.println(amount + "L 주유했습니다. 현재 연료량: " + fuel + "L\n");
    }

    /**
     * 주행
     * @param distance 주행할 거리
     */
    public void drive(int distance){
        int fuelNeeded = distance / 10; // 10km당 1L 소모
        if (fuel < fuelNeeded) {
            System.out.println("연료가 부족하여 " + distance + "km를 주행할 수 없습니다.\n");
            return;
        }else {
            System.out.println(distance + "km 주행했습니다. 연료 " + fuelNeeded + "L 소모되었습니다.\n");
            totalDistance += distance;
            fuel -= fuelNeeded;
        }

        if(fuel == 0){
            System.out.println("연료가 모두 소모되었습니다. 엔진을 정지합니다.\n");
            isEngineOn = false;
        }
    }
}