package start.method;

public class MethodValue2 {
    public static void main(String[] args) {
        // 해결방법 : return 값 반환

        int num1 = 5;
        System.out.println("1. changeNumber 호출전 : " + num1);
        num1 = changeNumber(num1);
        System.out.println("2. changeNumber 호출후 : " + num1);
    }

    public static int changeNumber(int num2) {
        return num2 * 2;
    }
}
