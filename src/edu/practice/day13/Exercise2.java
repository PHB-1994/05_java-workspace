package edu.practice.day13;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Exercise2 {

    public void solution1(){
        Path studentDir = Path.of("student");
        Path filePath = studentDir.resolve("student.txt");
        String content = "이름: 홍길동\n나이: 25\n전공: 컴퓨터공학\n학년: 3학년\n";

        try {
            Files.createDirectories(studentDir);

            Files.writeString(filePath, content);

            System.out.println("학생 정보 파일이 생성되었습니다.");

            String read = Files.readString(filePath);

            System.out.println("=== 파일 내용 ===");
            System.out.println(read);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void solution2(){
        Path textDir = Path.of("downloads", "text","downloaded_data.txt");

        String textUrl = "https://httpbin.org/base64/SGVsbG8gV29ybGQhIEphdmEgRmlsZSBJTyBQcmFjdGljZQ==";

        try {
            Files.createDirectories(textDir.getParent());
            URL url = new URL(textUrl);
            InputStream in = url.openStream();
            Files.copy(in, textDir);
            in.close();



            System.out.println("텍스트 다운로드 완료 : " + textDir);
            System.out.println("다운로드된 내용 : " + Files.readString(textDir));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void solution3(){
        Path backupDir  = Path.of("backup");
        String baseName = "document";
        String extension = ".txt";
        String content = "이것은 백업 문서입니다.";

        int counter = 1;

        while(Files.exists(backupDir)){
            String newName = baseName + "_" + counter + extension;
            backupDir = Path.of(backupDir + "/" + newName);
            counter++;
        }

        System.out.println("backupDir 의 주소 : " + backupDir);

        try {
            Files.createDirectories(backupDir.getParent());
            Files.writeString(backupDir,content);

            System.out.println("파일이 저장되었습니다 : " + backupDir.getFileName());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void solution4(){}

    public void solution5(){}

    public void solution6(){}
}
