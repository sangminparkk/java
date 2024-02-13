package start.array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        // 리팩토링 : 클린코드 관점(by 김영한)

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average;

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            sum += scanner.nextInt();
        }

        average = (double) sum / count;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
