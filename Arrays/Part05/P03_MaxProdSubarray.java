class P03_MaxProdSubarray {
    public static int maxProduct(int[] nums) {
        int pp = 1, sp = 1, n = nums.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pp == 0)
                pp = 1;
            if (sp == 0)
                sp = 1;

            pp = pp * nums[i];
            sp = sp * nums[n - i - 1];

            max = Math.max(max, Math.max(pp, sp));
        }
        return max;
    }

    public static void main(String[] args) {
        // Take custom input by adding scanner class
        int arr[] = { 1, 2, -5, -4, 3, -2, 4, 5 };
        System.out.println(maxProduct(arr));
    }
}