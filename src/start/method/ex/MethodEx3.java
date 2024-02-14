package start.method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 2000); // (내가 놓친 포인트) balance로 잡아주는게 중요했음
        balance = withdraw(balance, 3000);

        System.out.println("최종 잔액 = " + balance + "원");
    }

    // 메소드 = 책의 목차
    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원 입금. 현재 잔액 : " + balance);
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원 출금. 현재 잔액 : " + balance);
        } else {
            System.out.println("현재 잔액이 부족합니다." + balance);
        }
        return balance;
    }


}
