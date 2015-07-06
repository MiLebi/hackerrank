package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
Solution based on http://stackoverflow.com/questions/11893053/circular-left-shift-of-an-array-by-n-positions-in-java
 */
public class SherlockWatsonSolution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        final int N = Integer.parseInt(input[0]);
        final int K = Integer.parseInt(input[1]);
        final short Q = Short.parseShort(input[2]);
        final int[] A = new int[N];
        input = br.readLine().split(" ");
        for (int i = 0; i < N; ++i) A[i] = Integer.parseInt(input[i]);

        shift_array(A,K);
        System.out.print(Arrays.toString(A));

        for(short q = 0; q < Q; ++q){
            final int X = Integer.parseInt(br.readLine());
            System.out.println(A[X]);
        }
    }

    public static int GreatestCommonDivisor(int p, int q) {
        if (q == 0) return p;
        return GreatestCommonDivisor(q, p % q);
    }

    public static void shift_array(int[] A, int n) {
        int N = A.length;
        n %= N;
        if(n < 0) n = N + n;
        int d = GreatestCommonDivisor(N, n);
        for(int i = 0; i < d; i++) {
            int temp = A[i];

            for(int j = i - n + N; j != i; j = (j - n + N) % N)
                A[(j + n) % N] = A[j];

            A[i + n] = temp;
        }
    }
}
