package edu.polymorphism.pack3;

/**
 * 부모 클래스
 */
public class 직원 {
    // 필드
    protected String name;
    protected String position;
    protected int salary;

    // 생성자
    public 직원() {
    }
    public 직원(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // getter setter
    public String getName() {
        return name;
    }
    public void setName(String 사원이름) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // 메서드능
    @Override
    public String toString() {
        return  "이름='" + getName() + '\'' +
                ", 직급='" + getPosition() + '\'' +
                ", 연봉=" + getSalary();
    }
}
