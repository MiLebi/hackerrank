package codility;

public class MissingInteger {
    public int solution(int[] A) {
        boolean[] digits = new boolean[A.length + 1];
        for (int element : A) {
            if (1 <= element && element <= A.length) {
                digits[element - 1] = true;
            }
        }
        for (int i = 0; i < digits.length; i++) {
            if (!digits[i]) return i + 1;
        }
        return 0;
    }
}
