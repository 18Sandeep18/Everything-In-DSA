import java.util.HashMap;

public class P02_longSubarrayWithSumK {
    public static int longestSubArray(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = 0, n = arr.length, prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == k)
                length = i + 1;

            if (!map.containsKey(prefixSum))
                map.put(prefixSum, i);

            int remainingSum = prefixSum - k;

            if (map.containsKey(remainingSum)) {
                length = Math.max(length, i - map.get(remainingSum));
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 1 };
        int k = 4;
        System.out.println(longestSubArray(arr, k));
    }
}
