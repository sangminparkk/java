package start.cond;

public class If3 {

    public static void main(String[] args) {
        //동시할인 가능한 조건 => 독립적으로 적용 필요 > if문 2개

        int age = 10;
        int price = 10000;

        int discount = 0;

        if (age <= 10) {
            discount += 1000;
        }

        if (price >= 10000) {
            discount += 1000;
        }
        System.out.println("최종 할인금액: " + discount);
    }

}
