package start.scanner.ex;

import java.util.Scanner;

public class ScannerEx11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;
        boolean run = true;

        while (run) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3: 프로그램 종료");
            int process = sc.nextInt();

            switch (process){
                case 1:
                    sc.nextLine(); //개행문자 제거

                    System.out.print("상품명을 입력하세요: ");
                    String item = sc.nextLine();

                    System.out.print("상품의 가격을 입력하세요: ");
                    int price = sc.nextInt();

                    System.out.print("구매 수량을 입력하세요: ");
                    int quantity = sc.nextInt();

                    System.out.println("상품명: " + item + " 가격: " + price + " 수량:" + quantity + " 합계:" + price*quantity);
                    totalPrice += price * quantity;
                    break;
                case 2:
                    System.out.println("총 비용 " + totalPrice);
                    totalPrice = 0;
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
                default:
                System.out.println("올바른 옵션을 선택해주세요.");
                    break;
            }
        }
    }
}
