package start.cond;

public class If4 {

    public static void main(String[] args) {
        //동시할인 가능한 조건인데 > 연관성이 있는 if-else if를 쓴다면? 발생되는 문제점 확인

        int age = 10;
        int price = 10000;

        int discount = 0;

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        } else if (price >= 10000) { // if 문 만족으로 else-if는 건너뜀
            discount += 1000;
            System.out.println("1만원 이상 구매, 1000원 할인");
        }
        System.out.println("최종 할인금액: " + discount);

        /**
         * 팁)
         * if문 한줄만 사용할 경우 중괄호 생략 가능
         */

        if (true) System.out.println("한줄 출력");
    }

}
