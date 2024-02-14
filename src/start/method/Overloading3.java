package start.method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.2, 2.2));
    }

    public static int add(int a, int b) { // 이걸 삭제해도 아래 메소드 실행됨: double >>> int
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }


}
