class P01_MajorityEle {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int freq = 1;
        int val = nums[0];

        for (int i = 1; i < n; i++) {
            if (freq == 0) {
                val = nums[i];
                freq = 1;
            } else if (val == nums[i])
                freq++;
            else
                freq--;
        }
        return val;
    }

    public static void main(String[] args) {
        // Take custom input by adding Scanner class
        int arr[] = { 2, 2, 1, 1, 1, 2, 2, 1, 1, 1 };
        System.out.println(majorityElement(arr));
    }
}