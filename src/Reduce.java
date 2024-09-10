public class Reduce {
    public static void main(String[] args) {
        int answer = 0;
        int i = 100;
        while (i > 0) {
            if (i % 2 == 0) {
                i = i / 2;
                answer++;
            }
            else {
                i = i - 1;
                answer++;
            }
        }
        System.out.println(answer);
    }
}