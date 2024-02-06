package start.cond;

public class Switch3 {
    public static void main(String[] args) {

        int grade = 2;

        int coupon;

        // break가 없다면
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
            case 3:
                coupon = 3000; // break가 없기 때문에 3의 값이 출력
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급 받은 쿠폰: " + coupon);
    }

}
