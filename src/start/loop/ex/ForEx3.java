package start.loop.ex;

public class ForEx3 {

    public static void main(String[] args) {
        int max = 100; // 숫자 리터럴

        int sum = 0; // 누적 합계
        for (int i = 1; i <= max; i++) { // for문이 한줄로 깔끔하게 나옴
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
