package start.array.ex1;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10]; // 크기 지정이 필수
        int[] productPrices = new int[10];
        int productCount = 0; // 최대 10개 등록 가능

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    // 제약조건 1: max 10개 등록 가능
                    if (productCount < 10) {
                        System.out.print("상품 이름을 입력하세요: ");
                        productNames[productCount] = scanner.next();
                        scanner.nextLine(); //개행문자 제거

                        System.out.print("상품 가격을 입력하세요: ");
                        productPrices[productCount] = scanner.nextInt();

                        productCount++;
                    } else {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    }
                    break;

                case 2:
                    // 제약조건 2: 등록된 상품이 없는 경우
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                    } else {
                        for (int i = 0; i < productNames.length; i++) {
                            if (productNames[i] != null) {
                                System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("시스템 종료");
                    return;
            }
        }

    }
}
