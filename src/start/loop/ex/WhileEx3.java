package start.loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int max = 100; // 숫자 리터럴

        int sum = 0; // 누적 합계
        int i = 1; // 시작
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum); // 루프를 밖으로 빼심
    }
}
