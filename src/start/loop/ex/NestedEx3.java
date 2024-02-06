package start.loop.ex;

public class NestedEx3 {
    public static void main(String[] args) {

        //피라미드 역전 한다면?
        /**
         * rows = 2
         *  *
         * **
         *
         * rows = 5
         *     *
         *    **
         *   ***
         *  ****
         * *****
         */

        int rows = 5;
        for (int i = 1; i <= rows; i++) { // 5번 실행

            for (int j = 1; j <= (5-i); j++) { // 실제 피라미드 형상 출력
                System.out.print(" "); // 공백 4개 출력
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // 별
            }
            System.out.println();
        }
    }

}
