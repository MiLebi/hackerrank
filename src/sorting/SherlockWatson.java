package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SherlockWatson {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        final int N = Integer.parseInt(input[0]);
        final int K = Integer.parseInt(input[1]);
        final short Q = Short.parseShort(input[2]);
        List<Integer> list = new ArrayList<>();

        for (String input_number : br.readLine().split(" "))
            list.add(Integer.parseInt(input_number));

        Collections.rotate(list, K);

        for (int i = 0; i < Q; i++)
            System.out.println(list.get(Integer.parseInt(br.readLine())));
    }
}
