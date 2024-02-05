package start.operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        // 전위 증감
        int a = 1;
        int b = 0;

        b = ++a; // a의 값 증가 > 대입
        System.out.println("b = " + b); //2

        // 후위 증감
        a = 1;
        b = 0;

        b = a++; // a를 먼저 대입 > 그다음 연산하여 증가시킴
        System.out.println("a = " + a); //2
        System.out.println("b = " + b); //1

    }
}
