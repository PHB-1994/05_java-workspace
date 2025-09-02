package edu.polymorphism.ex2.model;

/*
부모 클래스
name
id
toString
를 작성
 */
public class UniverseMember {
    // 필드
    protected String Name;
    protected String Id;

    // 생성자
    public UniverseMember() {
    }
    public UniverseMember(String name, String id) {
        Name = name;
        Id = id;
    }

    // getter setter
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "학교 멤버{" +
                "Name='" + Name + '\'' +
                ", Id='" + Id + '\'';
    }




}
