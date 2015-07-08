package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IceCreamParlor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short test_cases = Short.parseShort(br.readLine());
        for (; test_cases > 0; --test_cases) {
            int M = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            int[] flavours_cost = new int[N];
            N = 0;
            for (String cost : br.readLine().split(" ")) flavours_cost[N++] = Integer.parseInt(cost);

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < flavours_cost.length - 1; i++) {
                for (int j = i + 1; j < flavours_cost.length; j++) {
                    if (flavours_cost[i] + flavours_cost[j] == M) {
                        sb.append(i + 1).append(" ").append(j + 1);
                        break;
                    }
                }
            }
            System.out.println(sb);
        }
    }
}
