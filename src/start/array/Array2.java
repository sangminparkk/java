package start.array;

public class Array2 {
    public static void main(String[] args) {
        /**
         * 배열 : 같은 타입의 변수를 하나로 묶는 것
         */
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성 > 크기 정의

        // 변수 값 대입
        students[0] = 90;
        students[1] = 70;
        students[2] = 80;
        students[3] = 85;
        students[4] = 50;

        //배열 사용
        System.out.println("학생 점수 = " + students[0]);
        System.out.println("학생 점수 = " + students[1]);
        System.out.println("학생 점수 = " + students[2]);
        System.out.println("학생 점수 = " + students[3]);
        System.out.println("학생 점수 = " + students[4]);
    }

}
