package start.array;

public class Array6 {
    public static void main(String[] args) {
        // 리팩토링
//        int[][] arr = new int[][]{
        int[][] arr = {
                {1,2,3},
                {4,5,6},
        };

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }

}
