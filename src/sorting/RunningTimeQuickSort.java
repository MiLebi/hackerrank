package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class RunningTimeQuickSort {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int numbersArray[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) numbersArray[i] = sc.nextInt();
        sc.close();
        int quickResult = quickSort(Arrays.copyOf(numbersArray, numbersArray.length), 0, numbersArray.length);
        int insertionResult = insertion_sort(numbersArray);
        System.out.println(insertionResult - quickResult);
    }

    private static int insertion_sort(int[] numbers_array) {
        int shift_count = 0;
        for (int i = 1; i < numbers_array.length; i++) {
            int unsorted_element = numbers_array[i];
            int j = i;
            while (j > 0 && numbers_array[j - 1] > unsorted_element) {
                numbers_array[j] = numbers_array[j - 1];
                --j;
                shift_count++;
            }
            numbers_array[j] = unsorted_element;
        }
        return shift_count;
    }

    public static int quickSort(int[] ar, int first, int last) {
        if (last - first < 2) return 0;
        int shiftCount = partition(ar, first, last);
        int midElementIndex = first + shiftCount - 1;
        // sort left side
        shiftCount += quickSort(ar, first, midElementIndex);
        // sort right side
        shiftCount += quickSort(ar, midElementIndex + 1, last);
        return shiftCount;
    }

    private static int partition(int[] array, int first, int last) {
        //Choose last element as pivot [hackerrank requirement]
        int pivot = array[--last];
        int storeIndex = first;
        int pivotIndex = first;
        int temp;

        while (storeIndex < last) {
            if (array[storeIndex] < pivot) {
                temp = array[storeIndex];
                array[storeIndex] = array[pivotIndex];
                array[pivotIndex] = temp;
                pivotIndex++;
            }
            storeIndex++;
        }

        // Switch mid element with pivot element
        array[last] = array[pivotIndex];
        // Move pivot value to correct place
        array[pivotIndex] = pivot;
        // Shift count
        return pivotIndex + 1 - first;
    }
}
