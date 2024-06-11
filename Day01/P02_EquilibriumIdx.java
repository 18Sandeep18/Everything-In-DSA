/*
 * Problem Statement:
 *         The pivot index is the index where the sum of all the numbers strictly 
 *         to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 */
public class Problem02 {

    public static int equilibriumIndex(int arr[]) {
        int n = arr.length;
        int pf[] = new int[n];

        pf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }
        int cnt = 0;

        if (pf[n - 1] - pf[0] == 0) {
            cnt++;
        }
        if (pf[n - 2] == 0) {
            cnt++;
        }
        for (int i = 1; i < n - 1; i++) {
            if (pf[i - 1] == pf[n - 1] - pf[i]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };

        System.out.println(equilibriumIndex(arr));
    }
}
