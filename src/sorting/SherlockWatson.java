package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
Explanation:
http://stackoverflow.com/questions/11893053/circular-left-shift-of-an-array-by-n-positions-in-java
 */
public class SherlockWatson {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");

        // N space-separated integers which indicate the elements of the array
        final int N = Integer.parseInt(input[0]);

        // performs the operation K times
        final int K = Integer.parseInt(input[1]);

        // He asks Q queries
        final short Q = Short.parseShort(input[2]);

        final int[] A = new int[N];
        input = br.readLine().split(" ");
        for (int i = 0; i < N; ++i) A[i] = Integer.parseInt(input[i]);

        shift_array(A, K);
        for (int i = 0; i < Q; i++) {
            int position = Integer.parseInt(br.readLine());
            System.out.println(A[position]);
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int c = a;
            a = b;
            b = c % a;
        }
        return a;
    }

    public static void shift_array(int[] A, int n) {
        int N = A.length;
        n %= N;
        if (n < 0)
            n = N + n;
        int d = gcd(N, n);
        for (int i = 0; i < d; i++) {
            int temp = A[i];
            for (int j = i - n + N; j != i; j = (j - n + N) % N)
                A[(j + n) % N] = A[j];
            A[i + n] = temp;
        }
    }
}
