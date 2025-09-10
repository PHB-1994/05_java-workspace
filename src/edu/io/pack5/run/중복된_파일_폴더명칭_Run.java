package edu.io.pack5.run;

import edu.io.pack5.service.중복된_파일_폴더명칭_Service;

import java.io.IOException;

public class 중복된_파일_폴더명칭_Run {

    public static void main(String[] args) throws IOException {
        중복된_파일_폴더명칭_Service service = new 중복된_파일_폴더명칭_Service();
        // service.saveImage1();
        // service.saveImage2();
        // service.saveImage3();
        // service.saveImage4();
        // service.saveImage5();

        String imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnOACrRJyk-4693gXNbbpXfQ4OVXSWm3sl5g&s";
        service.kakaoSvae(imgUrl);
    }
}
