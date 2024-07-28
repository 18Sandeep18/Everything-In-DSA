class Solution {
    public static int maxChunksToSorted(int[] arr) {
        int max = -1;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (i == max) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Take custom input by adding Scanner class
        int arr[] = { 1, 2, 0, 4, 3, 7, 5, 6, 8 };
        System.out.println(maxChunksToSorted(arr));
    }
}