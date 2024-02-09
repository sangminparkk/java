package start.scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해주세요: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 숫자를 입력해주세요: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("둘 중 큰수를 출력합니다 : " + num1);
        } else if (num2 > num1) {
            System.out.println("둘 중 큰수를 출력합니다 : " + num2);
        } else {
            System.out.println("두 숫자는 같습니다");
        }

    }
}
