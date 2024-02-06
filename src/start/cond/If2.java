package start.cond;

public class If2 {
    public static void main(String[] args) {

        int age = 10;

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) { // 코드 효율성 측면 > condition 만족시 나머지 반복문 체크X > "중복 체크"를 줄임
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

    }

}
