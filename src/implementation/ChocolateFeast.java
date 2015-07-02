import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();

        for (int i = 0; i < test_cases; ) {
            int N = sc.nextInt(); // money
            int C = sc.nextInt(); // chocolate price
            int M = sc.nextInt(); // wrappers

            int total = N/C;
            int wrappers = total;

            while (wrappers >= M){
                int free = wrappers/M;
                total += free;
                wrappers = free + wrappers%M;
            }

            System.out.println(total);
        }
        sc.close();
    }
}
