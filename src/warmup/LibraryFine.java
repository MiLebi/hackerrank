import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int actual_day = in.nextInt();
        int actual_month = in.nextInt();
        int actual_year = in.nextInt();

        int expected_day = in.nextInt();
        int expected_month = in.nextInt();
        int expected_year = in.nextInt();

        int fine = 0;

        if (actual_year > expected_year) fine = 10000;
        else if (actual_year < expected_year)  fine = 0;
        else if (actual_month > expected_month)  fine = (actual_month - expected_month) * 500;
        else if (actual_month < expected_month)  fine = 0;
        else if (actual_day > expected_day) fine = (actual_day - expected_day) * 15;
        System.out.print(fine);
    }
}