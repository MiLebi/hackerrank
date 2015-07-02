package sorting;

import java.util.Scanner;

public class QuicksortInPlace {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int numbersArray[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) numbersArray[i] = sc.nextInt();
        sc.close();
        quickSort(numbersArray, 0, numbersArray.length);
    }

    public static int quickSort(int[] ar, int first, int last) {
        if (last - first < 2) return 0;
        int shiftCount = partition(ar, first, last);
        int midElementIndex = first + shiftCount - 1;
        print(ar, 0, ar.length);

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

    public static void print(int[] ar, int first, int last) {
        StringBuilder str = new StringBuilder();
        while (first < last) str.append(ar[first++]).append(" ");
        System.out.println(str);
    }
}