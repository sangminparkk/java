package start.method;

public class MethodValue1 {
    public static void main(String[] args) {
        // 헷갈리게 하기 위해 변수명 통일

        int number = 5;
        System.out.println("1. changeNumber 호출전 : " + number);
        changeNumber(number);
        System.out.println("2. changeNumber 호출후" + number);
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경전" + number);
        number = number * 2;
        System.out.println("2. changeNumber 변경후" + number);
    }

}
