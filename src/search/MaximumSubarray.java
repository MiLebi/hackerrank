package search;

import java.util.Arrays;
import java.util.Scanner;

/*
Solution based on Kadane's algorithm
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        for (; test_cases > 0; --test_cases) {
            int N = sc.nextInt();
            int[] array = new int[N];
            int negative_count = 0;
            for (int i = 0; i < N; i++) {
                array[i] = sc.nextInt();
                if (array[i] < 0) negative_count++;
            }

            // if there are only negative numbers.
            if (negative_count == array.length) {
                Arrays.sort(array);
                int max = array[array.length - 1];
                System.out.println(max + " " + max);
            } else {
                int max_ending_here = 0;
                int max_so_far = 0;
                int max_non_contiguous = 0;

                for (int element : array) {
                    max_ending_here = Math.max(0, max_ending_here + element);
                    max_so_far = Math.max(max_so_far, max_ending_here);
                    if (element > 0) max_non_contiguous += element;
                }
                System.out.println(max_so_far + " " + max_non_contiguous);
            }
        }
    }
}