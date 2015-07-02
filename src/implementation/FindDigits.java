import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();

        for (int i = 0; i < test_cases; i++) {
            int number = sc.nextInt();
            String number_str = Integer.toString(number);
            int counter = 0;
            for (int j = 0; j < number_str.length(); j++) {
                int tmp = Character.getNumericValue(number_str.charAt(j));
                if (tmp != 0 && number % tmp == 0) counter++;
            }
            System.out.println(counter);
        }
    }
}
