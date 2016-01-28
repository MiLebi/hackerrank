package codility;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int sumPre = A[0];
        int sumPost = 0;
        for (int i = 1; i < A.length; i++) {
            sumPost += A[i];
        }
        int difMin = Math.abs(sumPost - sumPre);
        int tempSub = 0;
        for (int i = 1; i < A.length - 1; i++) {
            sumPre += A[i];
            sumPost -= A[i];
            tempSub = Math.abs(sumPost - sumPre);
            if (tempSub < difMin) {
                difMin = tempSub;
            }
        }
        return difMin;
    }
}
