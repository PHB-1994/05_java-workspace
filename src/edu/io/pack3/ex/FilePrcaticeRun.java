package edu.io.pack3.ex;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FilePrcaticeRun {



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        FilePracticeService fps = new FilePracticeService();
        System.out.println("폴더를 입력하시겠습니까? (yes/no) : ");
        // 없으면 기본 프로젝트 최상위로 폴더 설정
        // yes 이면 폴더 입력 후
        // dirName 으로 입력한 폴더이름 method1 전달
        String choice = sc.nextLine().trim().toLowerCase();
        //              글자입력받고  공백없음    모두소문자처리
        String dirName = "";
        if(choice.equals("yes") || choice.equals("y")){
            System.out.println("폴더명을 입력하세요 : ");
            dirName = sc.nextLine().trim();
        } else {
            dirName = "";
            System.out.println("기본 프로젝트 최상위 폴더로 설정됩니다.");
        }

        System.out.print("내용을 확인할 파일이름 + 확장자를 입력하세요 : ");
        String fileName = sc.nextLine();
        fps.method1(dirName, fileName);
    }
}
