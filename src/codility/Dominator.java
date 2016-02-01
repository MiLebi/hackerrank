package codility;

public class Dominator {
    public static int solution(int[] A) {
        if (0 == A.length) return -1;
        int count = 0;
        int current_max = A[0];

        for (int element : A) {
            if (element == current_max) count++;
            else {
                if (count == 0) {
                    count++;
                    current_max = element;
                } else count--;
            }
        }

        int candidate_count = 0;
        int candidate_index = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == current_max) {
                candidate_count++;
                candidate_index = i;
            }
        }

        if (candidate_count > A.length / 2) return candidate_index;
        else return -1;
    }


    public static void main(String... args) {
        System.out.print(solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
    }
}
