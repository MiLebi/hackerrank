package codility;

public class MinPerimeterRectangle {

    public int solution(int N) {
        int minPer = Integer.MAX_VALUE;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) minPer = Math.min(minPer, 2 * (N / i + i));
        }
        return minPer;
    }
}
