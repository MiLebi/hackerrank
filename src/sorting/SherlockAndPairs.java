package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SherlockAndPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (byte T = Byte.parseByte(br.readLine()); T > 0; --T) {
            br.readLine();
            HashMap<Long, Long> map = new HashMap<>();
            long count = 0;
            for (String number : br.readLine().split(" ")) {
                map.put(Long.valueOf(number), map.getOrDefault(Long.valueOf(number), 0l) + 1);
            }
            for (long number : map.values())
                if (number != 1)
                    count += number * (number - 1);

            System.out.println(count);
        }
    }
}