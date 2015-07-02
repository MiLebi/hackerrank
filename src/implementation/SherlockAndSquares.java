import java.util.Scanner;

public class SherlockAndSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();

        for (int i = 0; i < test_cases; ) {
            int low_range = sc.nextInt();
            int max_range = sc.nextInt();
            System.out.println(calculate(low_range, max_range));
        }
    }

    public static int calculate(int min, int max) {
        int low = (int) Math.ceil(Math.sqrt(min));
        int high = (int) Math.floor(Math.sqrt(max));
        return (high - low) + 1;
    }

}
