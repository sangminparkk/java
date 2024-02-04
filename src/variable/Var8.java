package variable;

public class Var8 {
    public static void main(String[] args) {

        //정수형 타입 : byte, short, int, long
        byte b = 127; // -128 ~ 127, 1byte > 파일 전송시에 바이트를 사용합니다.
        short s = 32767; // 2byte
        int i = 2147483647; // 약 -21억~20억, 4byte (MAX값 + 1 : integer number too large 컴파일 에러 발생)

        long l = 946126456L; // 대략 20억 넘어간다고 하면, 8byte > 코드작성시 대부분 넘어가질 않은 범위

        //실수형 타입
        float f = 10.0f;
        double d = 10.0;
    }
}
