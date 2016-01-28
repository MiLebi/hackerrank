package codility;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        return Double.valueOf(Math.ceil((Y - X) / (double) D)).intValue();
    }
}
