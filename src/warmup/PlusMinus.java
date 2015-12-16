package warmup;

import java.util.HashMap;
import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double digit_count = in.nextInt();
        HashMap<String, Integer> sum = new HashMap<String, Integer>() {{
            put("negative", 0);
            put("zero", 0);
            put("plus", 0);
        }};
        int digit;
        for (int i = 0; i < digit_count; i++) {
            digit = in.nextInt();
            if (digit < 0) sum.put("negative", sum.get("negative") + 1);
            else if (digit > 0) sum.put("plus", sum.get("plus") + 1);
            else sum.put("zero", sum.get("zero") + 1);
        }

        if (sum.get("plus") == 0) System.out.println(0);
        else System.out.println(sum.get("plus") / digit_count);

        if (sum.get("negative") == 0) System.out.println(0);
        else System.out.println(sum.get("negative") / digit_count);

        if (sum.get("zero") == 0) System.out.println(0);
        else System.out.println(sum.get("zero") / digit_count);
    }
}
