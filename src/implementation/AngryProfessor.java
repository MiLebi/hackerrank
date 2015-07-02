import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test_cases = in.nextInt();
        for (int test_no = 0; test_no < test_cases; test_no++) {
            int no_of_students = in.nextInt();
            int min_no_of_students = in.nextInt();

            int attendees = 0;

            for (int single_arrive = 0; single_arrive < no_of_students; single_arrive++) {
                int minutes = in.nextInt();
                if (minutes <= 0) attendees++;
            }
            String outcome = attendees < min_no_of_students ? "YES" : "NO";
            System.out.println(outcome);
        }
    }
}
