package codility;

import java.util.Arrays;

public class OddOccurrencesInArray {

    /*
    The Best Solution is to do bitwise XOR of all the elements. XOR of all elements gives us odd occurring element. Please note that XOR of two elements is 0 if both elements are same and XOR of a number x with 0 is x.
     */
    public static int solution(int[] A) {
        int res = 0;
        for (int element : A) res = res ^ element;
        return res;
    }

    public static void main(String... args) {
        int[] A = {9, 3, 9, 3, 6, 6, 11};
        System.out.println(solution(A));

    }

}
