package start.array.ex1;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        /**
         * 2차원 배열
         * 4명의 학생
         * row - 학생
         * column - 점수
         *
         * 학생 1 | 국어 | 영어 | 수학
         * 학생 2 | 국어 | 영어 | 수학
         * 학생 3 | 국어 | 영어 | 수학
         * 학생 4 | 국어 | 영어 | 수학
         */

        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        // 배열 생성
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j <= arr[i].length-1; j++) {
                System.out.print(subjects[j] + " 점수: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        // 합계 출력
        for (int i = 0; i <= arr.length-1; i++) {
            int sum = 0;
            double average;
            for (int j = 0; j <= arr[i].length-1; j++) {
                sum += arr[i][j];
            }
            average = (double) sum / 3;
            System.out.println((i+1) + "번 학생 총점 : " + sum + ", 평균: " + average);
        }
    }
}
