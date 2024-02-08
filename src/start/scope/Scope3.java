package start.scope;

public class Scope3 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // 좋은 코드는 아님

        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }

        System.out.println("m = " + m);
    }

}
