package edu.practice.day12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise1 {

    public void solution1(){
        Path folderPath = Path.of("practice");
        Path filePath = Path.of("practice", "hello.txt");
        String content = "안녕하세요! 자바 파일 처리 연습중입니다.";

        try {
            Files.createDirectories(folderPath);
            Files.writeString(filePath,content);
            System.out.println(filePath.getFileName() + " 파일 생성 완료!");

        } catch (IOException e) {
            System.out.println("파일 생성 실패!");
        }
    }

    public void solution2(){
        Path filePath = Path.of("practice", "hello.txt");

        if(!Files.exists(filePath)){
            System.out.println("파일을 찾을 수 없습니다.");
            return;
        }

        try {
            String content = Files.readString(filePath);
            System.out.println("파일 내용 : " + content);

        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다.");
        }
    }

    public void solution3(){
        Path filePath = Path.of("practice", "menu.txt");
        String content = "오늘의 메뉴\n1. 김치찌개\n2. 불고기\n3. 비빔밥";

        try {
            Files.writeString(filePath, content);
            System.out.println(filePath.getFileName() + " 파일 생성 완료!");

        } catch (IOException e) {
            System.out.println("파일을 생성하는데 실패했습니다.");
        }

        try {
            String readContent = Files.readString(filePath);
            System.out.println(readContent);

        } catch (IOException e) {
            System.out.println("파일을 읽는데 실패했습니다.");
        }
    }

    public void solution4(){
        Path filePath = Path.of("practice", "temp.txt");
        String content = "임시파일입니다.";

        try {
            Files.writeString(filePath,content);

        } catch (IOException e) {
            System.out.println("파일을 생성할 수 없습니다.");
        }


        if(!Files.exists(filePath)){
            System.out.println("해당하는 파일이 존재하지 않습니다.");
            return;
        } else {
            System.out.println(filePath.getFileName() + " 파일이 존재합니다.");
        }

        try {
            Files.delete(filePath);
            System.out.println(filePath.getFileName() + " 파일 삭제 완료!");

        } catch (IOException e) {
            System.out.println("파일을 삭제하는데 실패했습니다.");
        }

        if(!Files.exists(filePath)){
            System.out.println("파일 삭제 확인 : " + Files.exists(filePath));
        }
    }

    public void solution5(){
        Path dirPath = Path.of("study","java","basic");
        Path note1Path = Path.of("study","java","basic","note1.txt");
        Path note2Path = Path.of("study","java","basic","note2.txt");
        String note1Content = "자바 기초 공부중";
        String note2Content = "파일 처리 배우는 중";

        try {
            Files.createDirectories(dirPath);
            Files.writeString(note1Path, note1Content);
            Files.writeString(note2Path, note2Content);
            System.out.println("모든 파일 생성 완료");
            System.out.println(note1Path.getFileName() + " 내용 : " + note1Content);
            System.out.println(note2Path.getFileName() + " 내용 : " + note2Content);

        } catch (IOException e) {
            System.out.println("파일을 생성하는데 실패했습니다.");
        }

        System.out.println("note1 의 전체 경로 : " + note1Path + "\n" + "note2 의 전체 경로 : " + note2Path);

        try {
            System.out.println(note1Path.getFileName() + "의 크기(바이트) : " + Files.size(note1Path));
            System.out.println(note2Path.getFileName() + "의 크기(바이트) : " + Files.size(note2Path));

        } catch (IOException e) {
            System.out.println("크기를 확인할 수 없습니다.");
        }
    }

    public void copySolution(){

        try {
            Files.copy(Path.of("practice","hello.txt"),Path.of("practice1","hello2.txt"));

        } catch (IOException e) {
            System.out.println("복사하는데 실패했습니다.");
        }
    }
}
