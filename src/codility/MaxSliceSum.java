package codility;

public class MaxSliceSum {
    public static int solution(int[] A) {
        int max_ending = 0;
        int max_slice = 0;

        for (int element : A) {
            max_ending = Math.max(0, max_ending + element);
            max_slice = Math.max(max_slice, max_ending);
        }
        return max_slice;
    }

    public static void main(String... args) {
        System.out.print(solution(new int[]{3, 2, -6, 4, 0}));
    }
}
