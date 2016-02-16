package codility;

public class NumberSolitaire {
    public static int solution(int[] A) {
        int[] max_val = new int[A.length];
        max_val[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            max_val[i] = Integer.MIN_VALUE;
        }
        for (int pos = 0; pos < A.length - 1; pos++) {
            for (int dice_throw = 1; dice_throw <= 6; dice_throw++) {
                int jump_pos = pos + dice_throw;
                if (jump_pos >= A.length) continue;
                int tmp = A[pos + dice_throw] + max_val[pos];
                max_val[jump_pos] = max_val[jump_pos] < tmp ? tmp : max_val[jump_pos];
            }
        }
        return max_val[A.length - 1];
    }


    public static void main(String... args) {
        System.out.print(solution(new int[]{1, -2, 0, 9, -1, -2}));
        System.out.println(solution(new int[]{-1, -2, -3, -4, -3, -8, -5, -2, -3, -4, -5, -6, -1}));
    }
}
