import java.util.Arrays;

class P01_RotateMatrixBy90 {
    public static void transpose(int arr[][]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { // Lower traingle
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverseEveryRow(int arr[][]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // reversing
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - j - 1];
                arr[i][n - j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {

        // use custom input by adding Scanner class
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        transpose(arr);
        reverseEveryRow(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}