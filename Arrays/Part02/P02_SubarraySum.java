
class P02_SubarraySum {

    // naive:O(n^3)

    public static int subArraySum01(int arr[], int n) {
        int ans = 0;
        for (int s = 0; s < n; s++) {
            for (int e = 0; e < n; e++) {
                for (int i = s; i <= e; i++) {
                    ans += arr[i];
                }
            }
        }
        return ans;
    }

    // Better: O(n^2)

    public static int subArraySum02(int arr[], int n) {
        int psum[] = new int[n];
        psum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            psum[i] = arr[i] + psum[i - 1];
        }

        int ans = 0;

        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                if (s == 0) {
                    ans += psum[e];
                } else {
                    ans += (psum[e] - psum[s - 1]);
                }
            }
        }
        return ans;
    }

    // Optimal: O(n) ====== Contribution technique

    public static int subArraySum03(int arr[], int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int occ = (i + 1) * (n - i);
            ans += (occ * arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        // Custom the input values by adding scanner class
        int arr[] = { 3, -2, 4, -1, 2, 6, 2, 3, 4, 5 };
        System.out.println("O(n^3) approach: " + subArraySum01(arr, arr.length));
        System.out.println("O(n^2) approach: " + subArraySum02(arr, arr.length));
        System.out.println("O(n) approach: " + subArraySum03(arr, arr.length));
    }
}