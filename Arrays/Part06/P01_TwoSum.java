// import java.util.Arrays;

class P01_TwoSum {
    public static int[] twoSum(int arr[], int target) {

        int i = 0, n = arr.length, j = n - 1;

        while (i < j) {
            int k = arr[i] + arr[j];
            if (k == target) {
                return new int[] { i, j };
            } else if (k < target)
                i++;
            else
                j--;
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        // Take custom input by adding scanner class
        int arr[] = { 1, 5, 7, 12, 19 };
        int ans[] = twoSum(arr, 19);
        System.out.println(ans[0] + " " + ans[1]);
    }
}