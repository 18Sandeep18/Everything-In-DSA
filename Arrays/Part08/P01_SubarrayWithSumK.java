
import java.util.HashMap;

class Solution01 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int n = nums.length, prefixSum = 0, count = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            int remainingSum = prefixSum - k;

            if (map.containsKey(remainingSum)) {
                count += map.getOrDefault(remainingSum, 0);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 1 };
        int k = 5;
        System.out.print(subarraySum(arr, k));
    }
}