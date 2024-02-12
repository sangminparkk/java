package start.array;

public class Array3 {
    public static void main(String[] args) {
        int[] students = new int[5]; // 배열 선언 (초기화 = 크기)

        // 변수 값 대입
        students[0] = 90;
        students[1] = 70;
        students[2] = 80;
        students[3] = 85;
        students[4] = 50;

        //리팩토링
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + " 점수 = " + students[i]);
        }
    }
}
