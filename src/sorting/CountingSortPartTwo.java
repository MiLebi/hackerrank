package sorting;

import java.util.Scanner;

public class CountingSortPartTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int numbers_array[] = new int[array_size];
        int array_index_iterator = array_size;
        while (array_index_iterator-- > 0) numbers_array[sc.nextInt()]++;

        for (int i = 0; i < array_size; ++i) {
            int count = numbers_array[i];
            for (int j = 0; j < count; ++j) System.out.print(i + " ");
        }
    }
}