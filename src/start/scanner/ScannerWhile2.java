package start.scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("두 숫자 모두 0 입력시, 프로그램을 종료합니다."); // inform

        while (true) {
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            int num1 = sc.nextInt();

            System.out.print("두번째 숫자를 입력해주세요 : ");
            int num2 = sc.nextInt();

            int sum = num1 + num2;

            // condition
            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 최종 출력
            System.out.println("두 수의 합 : " + sum);
        }
    }

}
