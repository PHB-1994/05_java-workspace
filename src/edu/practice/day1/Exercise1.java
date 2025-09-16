package edu.practice.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    Scanner sc=new Scanner(System.in);
    List<String> userName = new ArrayList<>();
    List<Integer> userAge = new ArrayList<>();
    List<Double> userHeight = new ArrayList<>();
    List<Character> userGender = new ArrayList<>();
    List<String> userHobby = new ArrayList<>();

    public void method1(){

        /**
         *         === 개인정보 ===
         *         이름: 김자바
         *         나이: 25세
         *         키: 175.5cm
         *         성별: M
         *         취미: 프로그래밍
         */

        String name = "김자바";
        int age = 25;
        double height = 175.5;
        char gender = 'M';
        String hobby = "프로그래밍";

        System.out.println("=== 개인정보 ===");
        System.out.printf("이름 : %s\n나이 : %d세\n키 : %.1fcm\n성별 : %c\n취미 : %s",name,age,height,gender,hobby);
    }

    public void method2(){

        while(true){
            System.out.print("""
=== 회원 관리 시스템 ===
1. 회원 정보 등록
2. 회원 정보 조회
3. 회원 정보 이름 조회
0. 종료
번호를 입력하세요 : """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    register();
                    System.out.println("=== 개인 정보 ===");
                    break;
                case 2:
                    System.out.print("검색할 이름을 입력하세요 : ");
                    String inputName = sc.nextLine();
                    search(inputName);
                    System.out.println("조회가 완료되었습니다.");
                    break;
                case 3:

                    if(userName.isEmpty()){
                        System.out.println("등록된 직원이 없습니다.");
                        break;
                    }else {
                        for(int i = 0; i < userName.size(); i++){
                            System.out.println((i+1) + ". " + userName.get(i));
                        }
                        break;
                    }

                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 번호입니다. 0 ~ 3번 중에서 선택해주세요!");

            }
        }
    }

    public void register(){
        Path path = Path.of("src", "edu", "practice", "day1", "Exercise1.txt");
        StringBuilder sb = new StringBuilder();

        try {
            Files.createDirectories(path.getParent());

            while(true){
                System.out.println("개인 정보를 입력하세요. (종료를 입력하면 종료됩니다)");
                System.out.print("이름을 입력하세요 : ");
                String name = sc.next();

                if(name.equals("종료")){
                    break;
                }

                System.out.print("나이을 입력하세요 : ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.print("키을 입력하세요 : ");
                double height = sc.nextDouble();
                sc.nextLine();

                System.out.print("성별을 입력하세요 (M/S): ");
                char gender = sc.next().charAt(0);
                sc.nextLine();

                System.out.print("취미을 입력하세요 : ");
                String hobby = sc.nextLine();


                userName.add(name);
                userAge.add(age);
                userHeight.add(height);
                userGender.add(gender);
                userHobby.add(hobby);
                sb.append("이름 : " + name + "\n나이 : " + age + "세\n키 : " + height + "cm\n성별 : " + gender + "\n취미 : " + hobby);
            }

            Files.writeString(path, sb.toString(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);

            System.out.println("개인 정보가 저정되었습니다.");
            method2();


        } catch(InputMismatchException e){
            System.out.println("숫자만 입력이 가능합니다.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void search(String name){
        int index = userName.indexOf(name);
        int age = userAge.get(index);
        double height = userHeight.get(index);
        char gender = userGender.get(index);
        String hobby = String.valueOf(userHobby.get(index));

        if(index == -1){
            System.out.println("등록된 정보가 없습니다.");
        } else {
            System.out.println(name);
            System.out.println(age);
            System.out.println(height);
            System.out.println(gender);
            System.out.println(hobby);
        }
    }

}
