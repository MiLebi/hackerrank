import java.util.Scanner;

public class SherlockTheBeast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();

        for (int i = 0; i < test_cases; ) {
            int number = sc.nextInt();
            String result = "";

            for (int j = number; j >= 0; j--) {
                if (j % 3 == 0 && (number - j) % 5 == 0) {
                    result = repeat("5", j) + repeat("3", number - j);
                    break;
                }
            }

            if (result.isEmpty()) System.out.println("-1");
            else System.out.println(result);
        }
        sc.close();
    }

    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}
