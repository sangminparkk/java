package start.loop;

public class Break1 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        while (true) {
            sum += i; // sum = 1+2+3+4+5
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i = " + i + ", sum = " + sum);
                break; // 없으면 무한 루프
            }
            i++;
        }


    }
}
