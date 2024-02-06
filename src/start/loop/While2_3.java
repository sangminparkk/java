package start.loop;

public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;

        int i = 50;
        int endNum = 100;

        // while문 사용시 "반복 횟수"를 고려할 수 있음
        while (i <= endNum) {
            sum += i;
            System.out.println(i+ "번째 더한 수는 : " + sum);
            i++;
        }


    }
}
