package edu.practice.day3;

public class Practice2 {

    private String model;
    private int batteryLevel;
    private int userBattey;
    private boolean isPowerOn = true;

    /****** 실행 메서드 ******/
    public void method2(){
        System.out.println(getModel() + "의 전원이 켜졌습니다.");
        phoneInfo();
        useBattery();
        phoneInfoMinus();
        charge();
        phoneInfo();
    }

    /****** 메서드 = 기능 ******/
    // 기본 생성자
    public Practice2() {
    }

    // 필수 생성자
    public Practice2(String model, int batteryLevel, int userBattey) {
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.userBattey = userBattey;
    }

    // Setter
    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setUserBattey(int userBattey) {
        this.userBattey = userBattey;
    }

    // Getter
    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public int getUserBattey() {
        return userBattey;
    }

    public void charge(){
        System.out.println(getUserBattey() + "% 충전되었습니다.");
    }

    public void useBattery(){
        System.out.println("배터리를 " + getUserBattey() + "% 사용했습니다.");
        if(batteryLevel == 0) {
            System.out.println("배터리가 모두 소모되어 전원이 꺼집니다.");
            powerOff();
        }
    }


    public void powerOff(){
        System.out.println("전원이 꺼져있어 배터리를 사용할 수 없습니다.");
    }



    public void phoneInfo(){
        System.out.println("=== 스마트폰 상태 ===");
        System.out.println("모델: " + getModel());
        System.out.println("배터리: " + getBatteryLevel() + "%");
        System.out.println("전원 상태: " + (isPowerOn()? "on": "off") + "\n");
    }

    public void phoneInfoMinus(){
        System.out.println("=== 스마트폰 상태 ===");
        System.out.println("모델: " + getModel());
        System.out.println("배터리: " + (getBatteryLevel()-getUserBattey()) + "%");
        System.out.println("전원 상태: " + (isPowerOn()? "on": "off") + "\n");
    }
}
