class Solution3 {

    public static int kadanesAlgo(int arr[], int n) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (sum >= 0) {
                sum += arr[i];
            } else {
                sum = arr[i];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        // use custom inputs by adding scanner class
        int arr[] = { -3, 2, 4, -1, 3, -4, 21 };
        System.out.println(kadanesAlgo(arr, arr.length));

    }
}