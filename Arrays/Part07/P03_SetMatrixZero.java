import java.util.Arrays;

class P03_SetMatrixZero {
    public static void setZeroes(int[][] matrix) {
        int col0 = 1, m = matrix.length, n = matrix[0].length;

        // rowBox = matrix[][0]
        // colBox = matrix[0][]

        // Setting 0th col valueBox to zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                col0 = 0;
            }
        }

        // Setting 0th row valueBox to zero
        for (int i = 1; i < n; i++) {
            if (matrix[0][i] == 0) {
                matrix[0][0] = 0;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    // rowbox value setting to 0
                    matrix[i][0] = 0;
                    // colbox value setting to 0
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 0th column - rowBox
        if (matrix[0][0] == 0) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
        // 0th row - colBox
        if (col0 == 0) {
            for (int j = 0; j < m; j++) {
                matrix[j][0] = 0;
            }
        }
    }

    public static void main(String[] args) {

        // Take custom input by adding scanner class

        int arr[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}