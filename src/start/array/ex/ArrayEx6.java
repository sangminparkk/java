package start.array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요: ");
        int[] numbers = new int[5];

        // 리팩토링
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += scanner.nextInt();
        }

        double average = sum / numbers.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
