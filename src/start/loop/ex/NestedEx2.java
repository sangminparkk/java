package start.loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {

        //피라미드
        /**
         * rows = 2
         * *
         * **
         *
         * rows = 5
         * *
         * **
         * ***
         * ****
         * *****
         */

        int rows = 5;
        for (int i = 1; i <= rows; i++) { // 실행횟수
            for (int j = 1; j <= i; j++) { // 실제 피라미드 형상 출력
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

    }

}
