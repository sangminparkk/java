package start.scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;

        for (int i = 0; i < 2; i++) {
            System.out.println("m = " + m); // 블록 외부 변수는 내부 접근 가능
            System.out.println("i = " + i);
        }
        System.out.println("=== main 블록 ===");
        System.out.println("m = " + m);
    }

}
