package start.scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("0을 입력하는 순간, 프로그램은 종료가 되고 입력하신 모든 숫자의 합을 반환합니다");

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력해주세요(0을 입력하면 종료) : ");
            int num = sc.nextInt();

            if (num == 0) {
                break; // while문 종료
            }

            sum += num; // 조건 이후
        }

        // 반복문 break로 인해 종료된 이후, 최종 출력
        System.out.println("프로그램을 종료합니다. 모든 정수의 합 : " + sum);
    }
}
