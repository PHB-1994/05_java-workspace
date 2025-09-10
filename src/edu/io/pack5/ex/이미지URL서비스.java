package edu.io.pack5.ex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class 이미지URL서비스 {

    public void dirSaveImg(String imgUrl, String imgDir, String imgName) {
        Path path = Path.of("profiles",imgDir,imgName);

        try {
            Files.createDirectories(path.getParent());

            URL u = new URL(imgUrl);
            InputStream inputStream = u.openStream();
            Files.copy(inputStream, path);
            inputStream.close();

            System.out.println("이미지 저장을 완료했습니다.");

        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("이미지 저장 실패!");
        }

    }
}
