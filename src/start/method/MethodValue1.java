package start.method;

public class MethodValue1 {
    public static void main(String[] args) {
        // 대원칙: 자바는 항상 '변수의 값'을 '복사' + '대입(=전달)'한다
        // >> 값을 바꾸더라도 다른 변수에 영향을 주지 않습니다 ★★★ (포인터 개념)

        int num1 = 5;
        System.out.println("1. changeNumber 호출전 : " + num1);
        changeNumber(num1);
        System.out.println("2. changeNumber 호출후" + num1); // num1 != 10이 아니라 5임
    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경전" + num2);
        num2 = num2 * 2;
        System.out.println("2. changeNumber 변경후" + num2);
    }


}
