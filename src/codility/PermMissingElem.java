package codility;

public class PermMissingElem {
    /*
     sum of consecutive integers from 1 to n is equal to n(n+1)/2.
     */
    public int solution(int[] A) {
        long total = A.length + 1;
        long total_sum = total * (total + 1) / 2;
        long sum = 0L;
        for (int element : A) sum += element;
        return (int) (total_sum - sum);
    }
}
