import java.util.Scanner;
import java.util.StringTokenizer;

public class SongOfPi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases_number = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < test_cases_number; i++) {
            if (checkIsPie(sc.nextLine())) System.out.println("It's a pi song.");
            else System.out.println("It's not a pi song.");
        }
    }

    private static boolean checkIsPie(String song) {
        String pattern = "31415926535897932384626433833";
        return pattern.startsWith(createSongPattern(song));
    }

    private static String createSongPattern(String song) {
        String pattern = "";
        song = song.replaceAll("[^A-Za-z\\s]", "");
        StringTokenizer st = new StringTokenizer(song);
        while (st.hasMoreTokens()) pattern += st.nextToken().length();
        return pattern;
    }
}
