package edu.inheritance.ex;

public class Animal {

    private String name;
    private int age;
    private String color;

    // 기능들 = 메서드
    // Dog dog2 = new Dog();
    // Cat cat1 = new Cat();
    // Bird bird1 = new Bird();

    // 위와 같은 Animal 을 상속받는 생성자들의 기본 생성자를 사용하기 위해서는
    // 상속해주는 Animal 자체에서 기본 생성자가 존재해야함
    public Animal() {
    }

    // 매개변수 생성자
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // getter setter
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getColor() { return color; }

    // 새터 = 사용자가 작성한 데이터를 가지고 있는 기능
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setColor(String color) { this.color = color; }

    // 개발자가 필요로 하는 기타 메서드들
    public void showInfo(){
        System.out.println(" === 동물 정보 === ");
        System.out.println("이름 : " + getName());
        System.out.println("나이 : " + getAge());
        System.out.println("색깔 : " + getColor());
    }

    public void eat(){
        System.out.println(getName() + "은 12시에 밥을 먹습니다.");
    }

    public void sleep(){
        System.out.println(getName() + "은 10시에 잠을 잡니다.");

    }


    public void makeSound(){

    }

    public void move(){

    }
}
