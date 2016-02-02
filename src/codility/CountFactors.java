package codility;

public class CountFactors {
    public static int solution(int N) {
        int result = 0;
        int i = 1;
        while (i * i < N) {
            if (N % i == 0) result += 2;
            i++;
        }
        if (i * i == N) result++;

        return result;
    }

    public static void main(String... args) {
        System.out.print(solution(24));
    }
}
