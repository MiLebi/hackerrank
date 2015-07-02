package sorting;

import java.util.Scanner;

public class QuicksortPartTwo {
    public static StringBuffer str = new StringBuffer();

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int numbers_array[] = new int[array_size];
        for (int i = 0; i < array_size; i++) numbers_array[i] = sc.nextInt();
        sc.close();

        quickSort(numbers_array, 0, numbers_array.length);

        System.out.print(str);
    }

    public static void print(int[] ar, int min, int max) {
        while (min < max) str.append(ar[min++]).append(" ");
        str.append("\n");
    }

    public static void quickSort(int[] ar, int min, int max) {
        if (max - min < 2) return;

        int pivot_index = partition(ar, min, max);
        // firstly partition left side
        quickSort(ar, min, pivot_index);
        // then partition right side
        quickSort(ar, ++pivot_index, max);
        print(ar, min, max);
    }

    public static int partition(int[] sort_array, int min_index, int max_index) {
        int length = max_index - min_index;
        int[] smaller_elements = new int[length];
        int[] larger_elements = new int[length];
        int pivot = sort_array[min_index];

        // Partition
        int smaller_elements_real_lenght = 0;
        int larger_elements_real_lenght = 0;

        // Move elements to proper array
        for (int i = min_index + 1; i < max_index; ++i) {
            if (sort_array[i] < pivot) smaller_elements[smaller_elements_real_lenght++] = sort_array[i];
            else larger_elements[larger_elements_real_lenght++] = sort_array[i];
        }

        // Copy whole lower partition to our main array
        System.arraycopy(smaller_elements, 0, sort_array, min_index, smaller_elements_real_lenght);

        // Add pivot element after lower elements
        smaller_elements_real_lenght += min_index;
        sort_array[smaller_elements_real_lenght] = pivot;

        // Add larger elements after pivot
        for (int i = 0; i < larger_elements_real_lenght; ++i)
            sort_array[smaller_elements_real_lenght + i + 1] = larger_elements[i];

        return smaller_elements_real_lenght;
    }
}