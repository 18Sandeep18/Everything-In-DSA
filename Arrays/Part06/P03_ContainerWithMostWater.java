class P03_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

        int i = 0, n = height.length, j = n - 1;

        while (i < j) {
            // height //width
            int area = Math.min(height[i], height[j]) * (j - i);

            // updating max area
            max = Math.max(area, max);

            // if value in i is lesser update i because,
            // that value can't help us in getting max value of area
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return max;
    }

    public static void main(String[] args) {
        // Take custom input by adding scanner class
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(arr));
    }

}