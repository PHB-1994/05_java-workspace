package edu.study.problem5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class School {

    List<String> students = new ArrayList<>();
    List<String> studentIds = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    Path path = Path.of("student", "students.csv");

    StringBuilder sb = new StringBuilder();

    public void info(){

        try {
            while(true){
                System.out.println("""
=== 학생 관리 프로그램 ===
1. 학생 추가
2. 성적 저장
3. 정보 확인""");

                System.out.print("선택 : ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch(choice){
                    case 1:
                        saveDataToFile();
                        break;
                    case 2:
                        System.out.print("성적을 입력할 이름을 입력하세요 : ");
                        String name = sc.nextLine();
                        scoreDataToFile(name);
                        break;
                    case 3:
                        returnProgram();
                        return;
                    default:
                        System.out.println("잘못된 형식입니다.");
                        break;
                }
            }

        } catch(InputMismatchException e){
            System.out.println("잘못 입력하셨습니다.");
        }


    }

    public void saveDataToFile(){
        System.out.print("학생 이름을 입력하세요 : ");
        String name = sc.next();
        System.out.println(name + "의 학생이 추가되었습니다.");
        students.add(name);
    }

    public void scoreDataToFile(String inputName){

        if(!students.contains(inputName)){
            System.out.println("등록된 이름이 없습니다. 다시 시도해주세요");

        }else {
            try {
                Files.createDirectories(path.getParent());

                System.out.print("학번 입력 : ");
                String studentId = sc.nextLine();

                System.out.print("국어 점수 : ");
                int kor = sc.nextInt();
                sc.nextLine();

                System.out.print("영어 점수 : ");
                int eng = sc.nextInt();
                sc.nextLine();

                sb.append("학번 : " + studentId + ", 이름 : " + inputName + ", 국어 : " + kor + ", 영어 : " + eng + "\n");
                studentIds.add(studentId);

                Files.writeString(path, sb.toString(),  StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                System.out.println(path.getFileName() + " 파일에 데이터 저장 완료.");

            } catch(FileNotFoundException e) {
                System.out.println("파일이 존재하지 않습니다.");

            } catch (IOException e) {
                throw new RuntimeException(e);

            }

        }


    }

    public void returnProgram(){

        while(true){
            System.out.println("""
=== 학생 정보 확인 ===
1. 학생 목록 불러오기
2. 학생 목록 출력
3. 종료""");

            System.out.print("선택 : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    loadDateFile();
                    break;
                case 2:
                    totalLoadDate();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }

    }

    public void loadDateFile(){
        System.out.println(path.getFileName() + " 파일에서 데이터 로딩 완료.");
    }

    public void totalLoadDate(){
        System.out.println("=== 전체 학생 목록 ===");
        for(int i = 0; i < students.size(); i++){
            System.out.println(" - " + students.get(i) + "(" + studentIds.get(i) + ")");
        }
    }

    /*
     * saveDataToFile(String filename) 에서 매개변수 없이 진행했음....
     * loadDataFromFile(String filename) 에서 데이터 읽어서 리스트 추가???
     * FileWriter, PrintWriter, FileReader, BufferedReader 사용못함...
     * try-with-resources 사용못함...
     * Student 클래스에는 어떤걸 쓰는지...?
     * */

}