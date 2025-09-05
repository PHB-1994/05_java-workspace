package edu.collection.pack4.service;

public class 멤버기능서비스 {

    public void 멤버조회(String name, String phoneNumber, String email) {
        System.out.println( "멤버{" +
                "멤버이름='" + name + '\'' +
                ", 멤버핸드폰번호='" + phoneNumber + '\'' +
                ", 멤버이메일='" + email + '\'' +
                '}');;
    }
}
