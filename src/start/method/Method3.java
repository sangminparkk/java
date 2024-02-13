package start.method;

public class Method3 {
    public static void main(String[] args) {
        // 매개변수 X, 반환 타입이 없는 경우
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println(" = 프로그램을 시작합니다 = ");
    }

    public static void printFooter() {
        System.out.println(" = 프로그램을 종료합니다 = ");
    }

}
