import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int i = 0, j = 0, rsteps = matrix.length - 1, csteps = matrix[0].length - 1;

        while (rsteps > 0 && csteps > 0) {
            for (int k = 0; k < csteps; k++) {
                ans.add(matrix[i][j]);
                j++;
            }
            for (int k = 0; k < rsteps; k++) {
                ans.add(matrix[i][j]);
                i++;
            }
            for (int k = 0; k < csteps; k++) {
                ans.add(matrix[i][j]);
                j--;

            }
            for (int k = 0; k < rsteps; k++) {
                ans.add(matrix[i][j]);
                i--;
            }

            rsteps -= 2;
            csteps -= 2;
            i++;
            j++;
        }

        if (rsteps == 0) {
            for (int k = 0; k < csteps + 1; k++) {
                ans.add(matrix[i][j]);
                j++;
            }
        } else if (csteps == 0) {
            for (int k = 0; k < rsteps + 1; k++) {
                ans.add(matrix[i][j]);
                i++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        // Take Custom input by adding Scanner class
        int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        List<Integer> ans = spiralOrder(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}