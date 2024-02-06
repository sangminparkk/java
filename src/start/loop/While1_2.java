package start.loop;

public class While1_2 {

    public static void main(String[] args) {
        int count = 0;

        while (count < 3) { // 조건식 참일 경우에만 루프 반복
            count++;
            System.out.println("현재 숫자는 = " + count);
        }
    }
}
