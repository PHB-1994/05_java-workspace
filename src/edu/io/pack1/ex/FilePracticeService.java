package edu.io.pack1.ex;

import java.io.File;
import java.io.IOException;

public class FilePracticeService {

    //제공된 FileService.java의 개념(File 객체 생성,
    // mkdirs(), createNewFile(), exists(), listFiles() 등)을
    // 활용하여 다음 문제들을 해결해 보세요.
    // C:\Users\tj\Desktop\java-workspace\java_basic

    // 문제 1: 상대 경로를 이용한 폴더 및 파일 생성
    public void method1(){
        // 1. 경로 정의(상대 경로)
        String path = "my_logs"; // 폴더명칭 맨 앞에 / 가 붙지 않으면 현재 작업하고 있는 프로젝트 내 폴더 경로로 인식
        String filaName = "/access_log.log";

        // 2. file 객체 생성
        File logFolder = new File(path);
        File logFileName = new File(logFolder + filaName);

        // 3. 폴더 존재 여부 확인 및 생성
        if(!logFolder.exists()){
            logFolder.mkdirs();
            System.out.println(logFolder.getName() + " 폴더 생성을 완료했습니다.");
        } else{
            System.out.println("이미 폴더가 존재합니다.");
        }

        // 4. 폴더 존재 확인 후 폴더 내 파일 생성
        try {
            logFileName.createNewFile();
            System.out.println(logFileName.getName() + "파일 생성을 성공했습니다.");

        } catch (IOException e) {
            System.out.println("개발자가 생각치 못한 문제 발생");
            e.printStackTrace();
        } finally{
            System.out.println("프로그램을 종료합니다.");
        }
    }

    // 문제 2: 기존 디렉토리 목록 조회 및 유형 판별
    public void method2(){
        File file = new File("/Users/tj/Desktop/java-workspace/java_basic/src/edu/oop/method/ex/File");

        if(!file.exists()){
            file.mkdir();
        }

        File[]  files = file.listFiles();


        for(File f:files){

            String name = file.getName();

            String type;

            if(f.isFile()){
                type = "파일";
            }else {
                type = "폴더";
            }

            System.out.printf("%-10s %-10s\n",name, type);
        }
    }

    // 문제 3: 파일 생성 확인 및 삭제 처리
    public void method3(){}
}
