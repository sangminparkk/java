package start.array;

public class Array7 {
    public static void main(String[] args) {

        int[][] arr = new int[3][3]; // 배열 크기를 바꾸어도 배열이 채워짐
        int num = 1; // 후의 증감 연산자

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] += num++; // 1씩 증가되는 배열

                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }

}
