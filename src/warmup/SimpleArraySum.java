package warmup;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int result = 0;
        for (int i = 0; i < array_size; i++) result += sc.nextInt();
        System.out.print(result);
    }
}
