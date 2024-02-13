package start.method;

public class MethodReturn1 {
    public static void main(String[] args) {
//        checkAge(10);
        checkAge(20); // return문 만나서 그 뒤로는 출력이 안됨
    }

    public static void checkAge(int age) {
        if (age <= 20) {
            System.out.println("미성년자는 출입이 불가합니다");
            return; // return 이후로 출력이 안됨 (메서드는 return까지만 수행)
        }
        if (age >= 20) {
            System.out.println("입장하세요");
        }
    }
}
