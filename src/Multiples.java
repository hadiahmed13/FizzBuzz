public class Multiples {

    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i <= 1000; i++) {
            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf3) {
                answer++;
            }
            else if (multipleOf5) {
                answer++;
            }
        }
        System.out.println(answer);

    }
}
