import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class P02_MergeIntervals {
    public static int[][] merge(int[][] intervals) {

        // Sorting a 2d array
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] lastUpdated = intervals[0];
        result.add(lastUpdated);

        for (int i = 1; i < intervals.length; i++) {
            int currentInterval[] = intervals[i];
            int start = currentInterval[0];
            int end = currentInterval[1];

            if (start <= lastUpdated[1]) {
                lastUpdated[1] = Math.max(end, lastUpdated[1]);
            } else {
                result.add(currentInterval);
                lastUpdated = currentInterval;
            }
        }

        // converting a ArrayList<int[]> to 2d array
        return result.toArray(new int[result.size()][]);

    }

    public static void main(String[] args) {
        // Take custom input by adding scanner class
        int arr[][] = { { 1, 3 }, { 2, 6 }, { 5, 10 }, { 15, 18 } };
        int[][] ans = merge(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}
