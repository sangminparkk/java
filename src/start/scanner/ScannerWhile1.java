package start.scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("텍스트를 입력해주세요(exit 입력시 종료) : ");
            String str = sc.next();

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자 : " + str); // 조건을 통과하고 난 다음에 출력이 되는게 맞지
        }

    }
}
