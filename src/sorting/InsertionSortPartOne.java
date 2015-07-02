package sorting;

import java.util.Scanner;

public class InsertionSortPartOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int numbers_array[] = new int[array_size];
        for (int i = 0; i < array_size; i++) numbers_array[i] = sc.nextInt();
        sc.close();
        sort_from_right(numbers_array);
    }

    private static void sort_from_right(int[] numbers_array) {
        int i = numbers_array.length - 1;
        int unsorted_element = numbers_array[numbers_array.length - 1];
        while (i > 0 && numbers_array[i - 1] > unsorted_element) {
            numbers_array[i] = numbers_array[i - 1];
            --i;
            print_array(numbers_array);
        }
        numbers_array[i] = unsorted_element;
        print_array(numbers_array);
    }

    static void print_array(int[] array) {
        StringBuffer sb = new StringBuffer();
        for (int n : array) sb.append(n).append(" ");
        System.out.println(sb);
    }
}
