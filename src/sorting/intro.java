package sorting;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_to_find = sc.nextInt();
        int array_size = sc.nextInt();
        int numbers_array[] = new int[array_size];
        for (int i = 0; i < array_size; i++) numbers_array[i] = sc.nextInt();
        sc.close();
        System.out.print(find_with_index(number_to_find, array_size, numbers_array));
    }

    private static int find_with_index(int number_to_find, int array_size, int[] numbers_array) {
        for (int i = 0; i < array_size; i++) {
            if (numbers_array[i] == number_to_find) return i;
        }
        return -1;
    }
}
