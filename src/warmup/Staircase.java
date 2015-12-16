package warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digit_count = in.nextInt();
        String[] line;
        for (int i = digit_count - 1; i >= 0; i--) {
            line = new String[digit_count];
            Arrays.fill(line, " ");
            for (int j = i; j < digit_count; j++)
                line[j] = "#";
            for(int m = 0 ; m < digit_count ; m++ ){
                System.out.print(line[m]);
            }
            System.out.println("");
        }
    }
}
