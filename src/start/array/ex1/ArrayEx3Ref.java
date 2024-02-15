package start.array.ex1;

import java.util.Scanner;

public class ArrayEx3Ref {
    public static void main(String[] args) {

        /**
         * 1. 배열이름 : arr -> scores (의미)
         * 2. double은 나누기 (3.0)로, 한줄로 생성함
         */
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        // 배열 생성
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        // 합계 출력
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double average = sum / 3.0;
            System.out.println((i+1) + "번 학생 총점 : " + sum + ", 평균: " + average);
        }
    }
}
