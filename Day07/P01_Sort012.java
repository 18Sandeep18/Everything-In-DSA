import java.util.Arrays;

class Solution01 {
    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sortColors(int[] nums) {
        int l = 0, m = 0, n = nums.length, h = n - 1;

        // till mid and high not crosses
        while (m <= h) {
            if (nums[m] == 1) {
                m++;
            } else if (nums[m] == 0) {
                swap(nums, m, l);
                m++;
                l++;
            } else {
                swap(nums, m, h);
                h--;
            }
        }

    }

    public static void main(String[] args) {
        // Take custom input by adding scanner class
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 1, 0 };
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}