import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int factorial_size, increment_value;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        Scanner input = new Scanner(System.in);
        factorial_size = input.nextInt();

        for (increment_value = 1; increment_value <= factorial_size; increment_value++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }

        System.out.println(fact);
    }
}