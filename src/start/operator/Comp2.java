package start.operator;

public class Comp2 {
    public static void main(String[] args) {

        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result = str1.equals("문자열1"); // 문자열 변수, 리터럴 비교
        System.out.println(result);

        boolean result2 = "hello".equals("hello"); // 리터럴 비교
        System.out.println(result2);

        boolean result3 = str1.equals(str2); // 문자열 변수 비교
        System.out.println(result3);

    }
}
