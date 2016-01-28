package codility;

import java.util.Arrays;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        if(A.length == 0 ) return A;
        int[] b = new int[A.length];
        int shift = A.length - (K % A.length);
        for (int i = 0; i < A.length; i++) {
            if (shift >= A.length) shift = 0;
            b[i] = A[shift];
            shift++;
        }
        return b;
    }

    public static void main(String... args) {
        int[] A = {3, 8, 9, 7, 6};
        System.out.println(Arrays.toString(solution(A, 5)));

    }
}