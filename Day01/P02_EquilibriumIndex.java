import java.util.Arrays;

public class Problem03 {

    public static int[] prodOfArrItsef(int arr[]) {
        int n = arr.length;

        int pp[] = new int[n];
        pp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pp[i] = pp[i - 1] * arr[i];
        }

        int suffix = 1;

        for (int i = n - 1; i > 0; i--) {
            pp[i] = pp[i - 1] * suffix;
            suffix = suffix * arr[i];
        }
        pp[0] = suffix;
        return pp;
    }

    public static void main(String[] args) {
        // Use custom input by adding scanner class
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(prodOfArrItsef(arr)));

    }
}
