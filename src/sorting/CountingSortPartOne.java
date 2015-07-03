package sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingSortPartOne {
    public static int MAX_NUMBER_VALUE = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        Map<Integer, Integer> number_counting = new HashMap<>();
        for (int i = 0; i < array_size; i++) {
            int number = sc.nextInt();
            number_counting.put(number, number_counting.getOrDefault(number, 0) + 1);
        }
        sc.close();
        print_map(number_counting);
    }

    static void print_map(Map<Integer, Integer> map) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < MAX_NUMBER_VALUE; i++) sb.append(map.getOrDefault(i, 0)).append(" ");
        System.out.println(sb);
    }
}
