package start.method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        repeatString("Hello World!", 5); // repeatString > printMessage
    }

    public static void repeatString(String message, int times) { // n -> times
        System.out.println(times + "번 반복합니다.");
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
