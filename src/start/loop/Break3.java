package start.loop;

public class Break3 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1;  ;i++) { // i 변수는 for문 지역변수
            sum += i;
            if (sum > 10) {
                System.out.println("합계가 10보다 크면 종료: " + "i = " + i + ", sum = " + sum);
                break;
            }
        }

    }
}
