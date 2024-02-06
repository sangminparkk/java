package start.loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {
        int count = 1;
        int num = 1;

        while (count <= 10) {
            if (num % 2 == 0) { // 짝수
                System.out.println(num);
                count++;
            }
            num++;
        }

    }
}
