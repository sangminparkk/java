package start.variable;

public class Var7 {
    public static void main(String[] args) {

        /**
         * 변수 타입
         * *리터럴 : 개발자가 직접 적은, 고정된 값을 리터럴이라고 표현합니다.
         * 그래서 변수에 리터럴을 담아서 쓴다!
         */
        int a = 100; // 정수 리터럴
        double b = 10.55555555555; // 실수 리터럴
        boolean c = true; // 불리언 리터럴, true or false (판단)

        char d = 'A'; // 문자 리터럴 - 문자 하나 > Too many characters in character literal
        String e = "Hello Java"; // 문자열 리터럴 - 문자열을 다루기 위한 '특별한' 타입

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println("===Long 클래스===");
        Long number = 10L; // 클래스
        System.out.println(number);
    }
}
