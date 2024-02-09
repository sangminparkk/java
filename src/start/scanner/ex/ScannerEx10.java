package start.scanner.ex;

import java.util.Scanner;

public class ScannerEx10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;

        while (true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3: 프로그램 종료");
            int process = sc.nextInt();

            if (process == 1) {
                sc.nextLine();// 개행 문자 제거

                System.out.print("상품명을 입력하세요: ");
                String item = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = sc.nextInt();

                System.out.println("상품명: " + item + " 가격: " + price + " 수량:" + quantity + " 합계:" + price * quantity);
                totalPrice += price * quantity;
            } else if (process == 2) {
                System.out.println("총 비용 " + totalPrice);
                totalPrice = 0; // 초기화 (다음 구매자를 위함)
            } else if (process == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
//        switch (process) {
//            case 1:
//            case 2:
//            case 3:
//            default:
//        }
    }
}
