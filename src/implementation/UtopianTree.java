import java.util.Arrays;
import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_stics = sc.nextInt();
        int sticks[] = new int[no_of_stics];
        for (int i = 0; i < no_of_stics; i++) sticks[i] = sc.nextInt();
        sc.close();
        Arrays.sort(sticks);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < no_of_stics; ) {
            sb.append(no_of_stics - i).append("\n");
            while (true)
            {
                ++i;
                if (i >= no_of_stics || sticks[i - 1] != sticks[i]) break;
            }
        }
        System.out.print(sb);
    }
}
