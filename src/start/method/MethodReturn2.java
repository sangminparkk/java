package start.method;

public class MethodReturn2 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println("result = " + result);
    }

    public static boolean odd(int i) { // 홀수
        return i % 2 == 1 ? true : false;
    }

}