package start.method;

public class Method2 {
    public static void main(String[] args) {
        int sum1 = add(1, 2);
        System.out.println("두수의 합 = " + sum1);

        int sum2 = add(5, 10);
        System.out.println("두수의 합 = " + sum2);

    }
    // 메서드를 한번 정의하면 >> "재사용"이 가능하다는점!
    public static int add(int a, int b) { // 메서드 선언 : "선언만 해서 바로 사용가능" >> 객체
        System.out.println("두 수의 연산 수행: a + b"); // 메서드 본문 : "몰라도 되는 영역"
        return a + b;
    }
}
