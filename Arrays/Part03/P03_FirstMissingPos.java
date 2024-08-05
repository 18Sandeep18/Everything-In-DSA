class P03_FirstMissingPos {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        int i = 0;
        while (i < n) {
            if (nums[i] < 1 || nums[i] > n || nums[i] == i + 1) {
                i++;
            } else {
                int idx = nums[i] - 1;
                if (nums[i] == nums[idx])
                    i++;
                else {
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                }
            }

        }
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return n + 1;
    }

    public static void main(String[] args) {
        // Take custom input by adding Scanner class
        int arr[] = { 3, 5, 1, -2, 0, 4, 6 };
        System.out.println(firstMissingPositive(arr));
    }
}