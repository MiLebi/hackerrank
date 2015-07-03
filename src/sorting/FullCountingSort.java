package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
    Array solution is less readable.
    Map solution is less efficient.
 */
public class FullCountingSort {
    // [hackerrank requirement]
    public static int MAX_INPUT = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int mid_array_index = array_size / 2;
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, ArrayList<String>> keys_with_values = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> keys_indexes = new HashMap<>();

        for (int i = 0; i < array_size; i++) {
            int key = sc.nextInt();
            String value = sc.next();

            if (!keys_with_values.containsKey(key)) {
                keys_with_values.put(key, new ArrayList<>());
                keys_indexes.put(key, new ArrayList<>());
            }

            keys_with_values.get(key).add(value);
            keys_indexes.get(key).add(i);
        }

        for (int i = 0; i < MAX_INPUT; i++) {
            if (keys_with_values.containsKey(i)) {
                for (int j = 0; j < keys_with_values.get(i).size(); j++) {

                    int index = keys_indexes.get(i).get(j);
                    String index_value = keys_with_values.get(i).get(j);

                    // check "The twist" condition
                    if (index < mid_array_index) sb.append("-").append(" ");
                    else sb.append(index_value).append(" ");
                }
            }
        }

        System.out.println(sb);
    }
}