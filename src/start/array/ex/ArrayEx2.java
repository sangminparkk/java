package start.array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        int[] numbers = {number1, number2, number3, number4, number5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            // 점하나 빼기 ★★
            if (numbers[i] != numbers.length) {
                System.out.print(", ");
            }
        }



    }
}
