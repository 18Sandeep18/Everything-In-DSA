import java.util.Arrays;

public class Problem01 {

    public static void reverse(int arr[], int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        // Modify input values and make it custom by adding scanner class
        int arr[] = { 4, 1, 6, 9, 2, 14, 7, 8, 3 };
        int k = 6;
        k = k%arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
