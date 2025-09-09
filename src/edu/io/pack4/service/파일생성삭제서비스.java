package edu.io.pack4.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class 파일생성삭제서비스 {

    // createFolder

    // createFile

    // 각 메서드 생성 후
    // createFolder 를 이용해서 file/store/book 이라는 폴더 생성

    // createFile 에서는

    // file/store 존재하는지 확인하고

    // 존재하면 Book.txt 파일 생성

    // 더조은책방 - 책 리스트 한 줄 추가 후
    // 생성 완료까지 확인

    public void createFolder(){
        Path path = Path.of("file","store","book");

//        System.out.println("path : " + path);
//        System.out.println("path.getParent() : " + path.getParent());

        try {
            Files.createDirectories(path);
            System.out.println("파일이 생성되었습니다.");

        } catch (IOException e) {
            System.out.println("파일을 생성하는데 실패했습니다.");
        }
    }

    public void createFile(){
        Path path = Path.of("file","store","book","Book.txt");

        System.out.println("path : " + path);
        System.out.println("path.getParent() : " + path.getParent());

        if(!Files.exists(path.getParent())){
            System.out.println("폴더가 존재하지 않습니다.");
            System.out.println("폴더를 먼저 생성해주세요.");
        }

        try {
            Files.writeString(path, "더조은책방 - 구경하세요.");
            System.out.println("파일 생성 완료");

        } catch (IOException e) {
            System.out.println("폴더를 생성할 수 없습니다.");
        }

    }
}
