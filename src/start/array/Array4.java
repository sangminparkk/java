package start.array;

public class Array4 {
    public static void main(String[] args) {
        // 리팩토링
//        int[] students = new int[]{90, 70, 80, 85, 50};
        int[] students = {90, 70, 80, 85, 50};

        //리팩토링
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + " 점수 = " + students[i]);
        }
    }
}
