package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int MAX_ARRAY_SIZE = 10001;
        int[] diff_array = new int[MAX_ARRAY_SIZE];

        // first list
        int array_size = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < array_size; i++)
            diff_array[Integer.parseInt(temp[i])] += 1;


        // second list
        array_size = Integer.parseInt(br.readLine());
        temp = br.readLine().split(" ");
        for (int i = 0; i < array_size; i++)
            diff_array[Integer.parseInt(temp[i])] -= 1;

        print_non_zero_array_elements(diff_array);
    }

    private static void print_non_zero_array_elements(int[] diff_array) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < diff_array.length; i++)
            if (diff_array[i] != 0) str.append(i).append(" ");
        System.out.print(str);
    }
}
