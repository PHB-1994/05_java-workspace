package edu.io.pack8.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringBuilderService {

    Scanner sc = new Scanner(System.in);

    public void saveBooks(){
        Path bookDir = Path.of("books");
        Path bookFile = Path.of("books", "book_list.txt");
        StringBuilder bookData = new StringBuilder();

        try {
            Files.createDirectories(bookDir);

            System.out.println("도서 정보를 입력하세요 (완료를 입력하면 저장됩니다.");

            while(true){
                System.out.print("제목 : ");
                String title = sc.nextLine();

                if(title.equals("완료")){
                    break;
                }

                System.out.print("저자 : ");
                String author = sc.nextLine();

                System.out.print("출판년도 : ");
                String year = sc.nextLine();

                bookData.append("제목 : " + title + ", 저자 : " + author + ", 출판년도 : " + year + "\n");
            }

            Files.writeString(bookFile, bookData.toString());
            // while 로 데이터를 추가하는 동안은
            // 파일 아래에 지속적으로 추가되지만,
            // saveBooks 을 다시 실행하면 초기화 된 상태로 데이터가 다시 저장됨
            // 이어쓰기인지 매번 새로운 파일을 만드는지 파일을 만드는 목표를 확인하고, 옵션 설정

            System.out.println("도서 목록이 저장되었습니다 : " + bookFile.getFileName());

            System.out.println("저장된 내용 :\n" + Files.readString(bookFile));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void manageGrades(){
        Path gradeDir  = Path.of("grades");
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Path gradeFile  =  Path.of("grades", today + "_성적표.txt");
        StringBuilder gradeData  = new StringBuilder();

        try {
            Files.createDirectories(gradeDir);

            System.out.println(gradeDir + "폴더 생성되었습니다.");

            System.out.println("학생 성적을 입력하세요 (종료를 입력하면 저장됩니다)");

            while(true){
                System.out.print("이름 : ");
                String name =  sc.nextLine();

                if(name.equals("종료")){
                    break;
                }

                System.out.print("국어 : ");
                int kor =  sc.nextInt();
                sc.nextLine();

                System.out.print("영어 : ");
                int eng =  sc.nextInt();
                sc.nextLine();

                System.out.print("수학 : ");
                int math =  sc.nextInt();
                sc.nextLine();

                double avg = (kor+eng+math) / 3.0;

                gradeData.append("이름 : " + name + ", 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math + ", 평균 : " + avg + "\n");
            }

            // 모든 입력이 되어, 종료 를 작성했다면
            Files.writeString(gradeFile, gradeData.toString());

            System.out.println("\n오늘 성적표가 작성되었습니다 : " + gradeFile.getFileName());

            System.out.println("정보 - " + Files.readString(gradeFile));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void recordAccount(){
        Path householdDir  = Path.of("household");
        Path accountFile  = Path.of("household","account_book.txt");
        String timestamp = getCurrentTime();

        StringBuilder accountData = new StringBuilder();

        try {
            Files.createDirectories(householdDir);

            System.out.println("가계부 내역을 입력하세요 (끝을 입력하면 저장됩니다)");

            while(true){
                System.out.print("항목 : ");
                String 항목 = sc.nextLine();

                if(항목.equals("끝")){
                    break;
                }

                System.out.print("금액 : ");
                int 금액 = sc.nextInt();
                sc.nextLine(); // 숫자나 소수자리는 작성하고 나면 줄바꿈 처리가 되기 때문에 반드시 nextLine() 써야함

                System.out.print("수입/지출 : ");
                String money = sc.nextLine();

                String 계산 = "";

                if(money.equals("수입")){
                    계산 = "+";
                }else if(money.equals("지출")){
                    계산 = "-";
                }

                accountData.append(timestamp + " - " + 항목 + " : " + 계산 + 금액 + "원 (" + money + ")\n");
            }

            Files.writeString(accountFile, accountData.toString(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            System.out.println("가계부 기록이 추가되었습니다.");
            System.out.println("=== 전체 가계부 기록 ===");
            System.out.println(Files.readString(accountFile));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getCurrentTime(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public void registerCustomer(){
        Path customerDir  = Path.of("customers");
        Path customerFile  = Path.of("customers","customer_list.txt");
        StringBuilder customerData = new StringBuilder();

        try {
            Files.createDirectories(customerDir);

            System.out.println("고객 정보를 입력하세요 (exit을 입력하면 저장됩니다.)");
            while(true){
                System.out.print("이름 : ");
                String name = sc.nextLine();

                if(name.equals("exit")){
                    break;
                }

                System.out.print("전화번호 : ");
                String phoneNumber = sc.nextLine();

                System.out.print("이메일 : ");
                String email = sc.nextLine();

                System.out.print("주소 : ");
                String address = sc.nextLine();

                customerData.append("이름 : " + name + "\n전화번호 : " + phoneNumber + "\n이메일 : " + email + "\n주소 : " + address + "\n");
            }

            if(Files.exists(customerFile)){
                System.out.println("기존 고객 명단을 업데이트합니다.");
                Files.writeString(customerFile, customerData.toString(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } else {
                System.out.println("새로운 고객 명단을 업데이트합니다.");
                Files.writeString(customerFile, customerData.toString());
            }

            System.out.println("고객 명단이 저장되었습니다 : " + customerFile.getFileName());
            System.out.println(Files.readString(customerFile));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void processOrder(){
        Path orderDir = Path.of("orders");
        Path orderFile  = Path.of("orders","order_history.txt");
        StringBuilder orderData = new StringBuilder();
        String timestamp = getCurrentTime();

        int totalAmount = 0;

        try {
            Files.createDirectories(orderDir);

            System.out.println("메뉴 주문을 입력하세요 (주문완료를 입력하면 저장됩니다)");

            orderData.append("=== 주문 내역서 ===\n주문 시간 : " + timestamp + "\n");

            while(true){
                System.out.print("메뉴명 : ");
                String name = sc.nextLine();

                if(name.equals("주문완료")){
                    timestamp = getCurrentTime();
                    break;
                }

                System.out.print("수량 : ");
                int quantity = sc.nextInt();
                sc.nextLine();

                System.out.print("가격 : ");
                int price = sc.nextInt();
                sc.nextLine();

                int totalPrice = price * quantity;
                totalAmount += totalPrice;

                orderData.append(
                    "메뉴 : " + name + "\n" +
                    "수량 : " + quantity + "\n" +
                    "단가 : " + price + "원\n" +
                    "총액 : " + totalPrice + "원\n"
                );
            }
            orderData.append("주문 완료 시간 : " + timestamp + "\n");;
            orderData.append("전체 주문 금액 : " + totalAmount + "원");

            Files.writeString(orderFile, orderData.toString());

            System.out.println("주문 내역이 저장되었습니다 : " + orderFile.getFileName());

            System.out.println(Files.readString(orderFile));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
