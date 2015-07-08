package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pairs {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first_line = br.readLine().split(" ");
        int N = Integer.parseInt(first_line[0]);
        int K = Integer.parseInt(first_line[1]);
        int[] A = new int[N];
        N = 0;
        for (String number : br.readLine().split(" ")) A[N++] = Integer.parseInt(number);

        System.out.println(count_pairs(K, A));
    }

    private static int count_pairs(int diff, int[] array) {
        Arrays.sort(array);
        int count = 0;
        for (int i = 0; i < array.length; i++)
            count += Arrays.binarySearch(array, i + 1, array.length, array[i] + diff) < 0 ? 0 : 1;
        return count;
    }
}