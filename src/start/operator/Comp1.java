package start.operator;

public class Comp1 {
    public static void main(String[] args) {

        // 비교연산자 > 결과값: boolean (참 혹은 거짓)
        int a = 2;
        int b = 3;

        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // false
        System.out.println(a < b); // true

        System.out.println("=====");
        boolean result = a == b;
        System.out.println(result);

    }
}
