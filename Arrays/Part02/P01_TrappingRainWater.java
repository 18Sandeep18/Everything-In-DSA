
class P01_TrappingRainWater {
    public static int trap(int[] arr) {
        int n = arr.length;

        int[] prefixmax = new int[n];
        int[] suffixmax = new int[n];

        prefixmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixmax[i] = Math.max(prefixmax[i - 1], arr[i]);
        }

        suffixmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixmax[i] = Math.max(suffixmax[i + 1], arr[i]);
        }

        int ans = 0;
        for (int i = 1; i < n; i++) {
            ans += Math.min(prefixmax[i], suffixmax[i]) - arr[i];
        }

        return ans;

    }

    public static void main(String[] args) {
        // make custom input by adding scanner class
        int arr[] = { 2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1 };
        System.out.println(trap(arr));
    }
}
