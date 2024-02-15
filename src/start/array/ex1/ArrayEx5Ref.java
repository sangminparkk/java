package start.array.ex1;

import java.util.Scanner;

public class ArrayEx5Ref {
    public static void main(String[] args) {
        int maxProducts = 10; //별도 생성 >> 나중에 arrays.list를 통해서 사용자가 동적으로 배열의 크기를 수정하거나 변경할 수 있다! ★★★★
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: "); // 메뉴 선택 추가
            int menu = scanner.nextInt(); // 10\n 중에 10만 처리함으로 나머지 엔터 처리를 위해 아래 추가
            scanner.nextLine(); //개행문자 제거

            if (menu == 1) {
                if (productCount >= maxProducts) { // if절 처리가 핵심
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue; // 계속 돌아야함
                }
                // if문 조건 안 걸리면 아래 처리
                    System.out.print("상품 이름을 입력하세요: ");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("상품 가격을 입력하세요: ");
                    productPrices[productCount] = scanner.nextInt();

                    productCount++;
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount; i++) { // product Count만큼 돌아야함 > 클린
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("시스템 종료");
                break;
            } else {
                System.out.println("잘못된 옵션을 선택하셨습니다.");
            }
        }
    }
}
