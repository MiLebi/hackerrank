package codility;

public class PermCheck {
    static int solution(int A[]) {
        int[] permutation_array = new int[A.length];

        for (int element : A) {
            if (element < 1 || element > A.length) {
                return 0;
            } else if (permutation_array[element - 1] == 1) {
                return 0;
            } else {
                permutation_array[element - 1] = 1;
            }
        }
        return 1;
    }

    public static void main(String... args) {
        System.out.println(solution(new int[]{4, 3, 1}));
    }
}
