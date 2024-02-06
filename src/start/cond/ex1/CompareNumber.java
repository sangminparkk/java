package start.cond.ex1;

public class CompareNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b; // 변수명이 result -> max 가 옳은 표현
        System.out.println("둘 중에 더 큰 숫자는 " + max);
    }
}
