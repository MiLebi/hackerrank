package sorting;

import java.util.Scanner;

public class RunningTimeAlgorithms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int numbers_array[] = new int[array_size];
        for (int i = 0; i < array_size; i++) numbers_array[i] = sc.nextInt();
        sc.close();
        insertion_sort(numbers_array);
    }

    private static void insertion_sort(int[] numbers_array) {
        int counter = 0 ;
        for (int i = 1; i < numbers_array.length; i++) {
            int unsorted_element = numbers_array[i];
            int j = i;
            while (j > 0 && numbers_array[j - 1] > unsorted_element) {
                numbers_array[j] = numbers_array[j - 1];
                counter ++;
                --j;
            }
            numbers_array[j] = unsorted_element;
        }
        System.out.println(counter);
    }
}