import java.util.Scanner;

public class ServiceLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int freeway_length = sc.nextInt();
        int test_cases = sc.nextInt();

        int width[] = new int[freeway_length];
        for (int i = 0; i < freeway_length; i++) width[i] = sc.nextInt();

        for (int i = 0; i < test_cases; ) {
            int in = sc.nextInt();
            int out = sc.nextInt();
            int smallest = width[in];
            for(; in <= out ; in++)
                if(width[in]<smallest) smallest = width[in];

            System.out.println(smallest);
        }
    }
}
