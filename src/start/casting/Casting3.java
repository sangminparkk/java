package start.casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("intValue = " + intValue);

        int maxValue = (int) maxIntOver; // int 의 범위를 넘어서니까 음수가 나옴 ㄷㄷ >> 오버캐스팅하면 이렇게 됨
        System.out.println("maxValue = " + maxValue);
    }

}
