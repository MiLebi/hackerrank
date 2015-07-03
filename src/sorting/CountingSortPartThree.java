package sorting;

import java.util.Scanner;

public class CountingSortPartThree {
    // [hackerrank requirement]
    public static int MAX_INPUT_SIZE = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers_array[] = new int[MAX_INPUT_SIZE];

        int array_size = sc.nextInt();
        while (array_size-- > 0) {
            numbers_array[sc.nextInt()]++;
            // omit word
            sc.next();
        }
        for (int i = 1; i < MAX_INPUT_SIZE; ++i)
            numbers_array[i] += numbers_array[i - 1];

        for (int i = 0; i < MAX_INPUT_SIZE; ++i)
            System.out.print(numbers_array[i] + " ");
    }
}