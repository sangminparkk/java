package start.array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        // 리팩토링
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요: ");
        int[] numbers = new int[5];

        // 대입
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            // 점하나 빼기 ★★
            if (i < numbers.length -1) {
                System.out.print(", ");
            }
        }

    }
}
