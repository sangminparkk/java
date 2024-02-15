package start.array.ex;

import java.util.Scanner;

public class
ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요: ");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

//         정수 역순으로 출력
        for (int i = (numbers.length-1); i >= 0 ; i--) {
            System.out.print(numbers[i]);

            if (i > 0) { // 이걸 왜 못 푸냐;;;
                System.out.print(", ");
            }
        }

    }
}
