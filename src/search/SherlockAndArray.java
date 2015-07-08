package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SherlockAndArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short test_cases = Short.parseShort(br.readLine());
        for (; test_cases > 0; --test_cases) {
            int N = Integer.parseInt(br.readLine());
            int[] A = new int[N];
            N = 0;
            for (String number : br.readLine().split(" ")) A[N++] = Integer.parseInt(number);

            int left_index = 0;
            int right_index = A.length - 1;
            int sum_left = A[left_index++];
            int sum_right = A[right_index--];

            while (--N > 0) {
                if (left_index == right_index) break;
                if (sum_left < sum_right) sum_left += A[left_index++];
                else sum_right += A[right_index--];
            }

            if (sum_left == sum_right) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
