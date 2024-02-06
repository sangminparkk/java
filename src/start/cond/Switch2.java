package start.cond;

public class Switch2 {
    public static void main(String[] args) {

        int grade = 2;

        int coupon;

        /**
         * switch-case문
         * > if문인데 단순해. 장점 : 직관적
         */

        switch (grade) {
            case 1:
                coupon = 1000;
                break; // case1 종료되면서 switch문을 빠져 나옴 > 아래 코드 진행 X
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급 받은 쿠폰: " + coupon);
    }
}
