package start.method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
     System.out.println("평균값: " + average(15, 25, 35));
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
