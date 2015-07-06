package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClosestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int numbers_array[] = new int[array_size];
        for (int i = 0; i < array_size; i++) numbers_array[i] = sc.nextInt();
        sc.close();
        Arrays.sort(numbers_array);
        print_list(findClosesNumber(numbers_array));
    }

    private static List<Integer> findClosesNumber(int[] numbers_array) {
        List<Integer> result = new ArrayList<>();
        int smallest_diff = Integer.MAX_VALUE;
        for (int i = 0; i < numbers_array.length - 1; i++) {
            int dif = Math.abs(numbers_array[i] - numbers_array[i + 1]);
            if (dif < smallest_diff) {
                smallest_diff = dif;
                result.clear();
                result.add(numbers_array[i]);
                result.add(numbers_array[i + 1]);
            } else if (dif == smallest_diff) {
                result.add(numbers_array[i]);
                result.add(numbers_array[i + 1]);
            }
        }
        return result;
    }

    private static void print_list(List<Integer> list) {
        StringBuffer sb = new StringBuffer();
        for (int n : list) sb.append(n).append(" ");
        System.out.print(sb);
    }
}