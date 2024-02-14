package start.method.ex;

import java.util.Scanner;

public class MethodEx5Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0; // 초기화

        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료 ");
            System.out.println("-----------------------------------------");

            System.out.print("선택: ");
            int process = scanner.nextInt();

            switch (process) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    int depositAmount = scanner.nextInt();
                    balance = deposit(balance, depositAmount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    int withdrawAmount = scanner.nextInt();
                    balance = withdraw(balance, withdrawAmount);
                    break;
                case 3:
                    balance = getBalance(balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return; // 바로 종료 (main 메서드 종료) -> break; 걸어도 while문이 밖에서 계속 돈다
                default:
                    System.out.println("잘못된 옵션을 선택하셨습니다.");
                    break;
            }

        }
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static int getBalance(int balance) {
        System.out.println("현재 잔액 : " + balance + "원");
        return balance;
    }
}
