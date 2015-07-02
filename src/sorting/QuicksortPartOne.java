package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuicksortPartOne {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int numbers_array[] = new int[array_size];
        for (int i = 0; i < array_size; i++) numbers_array[i] = sc.nextInt();
        sc.close();
        quicksort(numbers_array);
    }

    private static void quicksort(int[] numbers_array) {
        int pivot = numbers_array[0];
        ArrayList<Integer> low = new ArrayList<Integer>();
        ArrayList<Integer> high = new ArrayList<Integer>();
        for (int array_element : numbers_array) {
            if (array_element >= pivot) high.add(array_element);
            else low.add(array_element);
        }
        print_list(low);
        print_list(high);
    }

    static void print_list(List<Integer> list) {
        StringBuffer sb = new StringBuffer();
        for (int n : list) sb.append(n).append(" ");
        System.out.print(sb);
    }
}
