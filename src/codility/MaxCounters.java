package codility;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int applyMax = N + 1;
        int result[] = new int[N];
        int maxOfCounter = 0, lastUpdate = 0;

        for (int element : A) {
            if (element == applyMax) {
                lastUpdate = maxOfCounter;
            } else if (element <= N) {
                int position = element - 1;
                result[position] = result[position] > lastUpdate
                        ? result[position] + 1 : lastUpdate + 1;
                if (maxOfCounter <= result[position]) {
                    maxOfCounter = result[position];
                }
            }
        }
        for (int i = 0; i < N; ++i) {
            if (result[i] < lastUpdate) {
                result[i] = lastUpdate;
            }
        }
        return result;
    }
}
