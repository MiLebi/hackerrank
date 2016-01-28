package codility;

public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        int max = 0;
        int count = -1;
        int right_bit = 0;
        while(N>0){
            right_bit = N & 1;
            N = N >> 1;
            if(right_bit == 0 && count >= 0){
                count++;
            }
            if(right_bit == 1) {
                max = count > max ? count : max;
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
//        System.out.println(solution(1041));
//        System.out.println(solution(15));
    }
}
