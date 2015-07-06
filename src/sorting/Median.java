package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Median {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int numbers_array[] = new int[array_size];
        for (int i = 0; i < array_size; i++) numbers_array[i] = sc.nextInt();
        sc.close();
        Arrays.sort(numbers_array);
        int mid = array_size / 2;
        System.out.println(numbers_array[mid]);
    }
}