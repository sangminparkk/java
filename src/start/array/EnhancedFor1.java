package start.array;

public class EnhancedFor1 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        System.out.println("일반 for loop");
        for (int i = 0; i < numbers.length; i++) { // 조건 설정 필요
            System.out.println(i);
        }

        System.out.println("향상된 for loop");
        //Enhanced for : 조건설정없이 컬렉션 하나씩 순회 >> 실무에서 제일 많이 쓰는 for문
        for (int x : numbers) {
            System.out.println(x);
        }

        // 향상된 for문을 사용하지 못하는 경우 > 특정 인덱스를 불러와야할때 > "i" (증가하는 인덱스)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는 " + numbers[i]);
        }
    }

}
