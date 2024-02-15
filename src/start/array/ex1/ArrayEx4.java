package start.array.ex1;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수를 입력해주세요: ");

        int studentCount = scanner.nextInt();
        int[][] scores = new int[studentCount][3];
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
