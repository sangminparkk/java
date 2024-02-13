package start.method;

public class Method1 {
    public static void main(String[] args) {
        /**
         * 메서드 필요한 이유 : 동일한 연산이 중복되는 경우, 코드 수정시 or 변수 추가시 단순반복작업이 늘어남
         */
        // 계산1
        int a = 1;
        int b = 2;
        System.out.println("두 수의 연산 수행 => a + b = " + (a + b) );

        int sum = a + b;
        System.out.println("두수의 합 = " + sum);

        // 계산2
        int x = 1;
        int y = 2;
        System.out.println("두 수의 연산 수행 => x + y = " + (x + y) );

        int sum2 = x + y;
        System.out.println("두수의 합 = " + sum2);
    }

}
