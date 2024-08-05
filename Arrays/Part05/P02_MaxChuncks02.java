class P02_MaxChuncks02 {
    public static int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int pmax[] = new int[n];
        int smin[] = new int[n];

        pmax[0] = arr[0];
        smin[n - 1] = arr[n - 1];

        // calculating pmax
        for (int i = 1; i < n; i++) {
            pmax[i] = Math.max(pmax[i - 1], arr[i]);
        }

        // calculating smin
        for (int i = n - 2; i >= 0; i--) {
            smin[i] = Math.min(smin[i + 1], arr[i]);
        }

        int chunks = 0;

        for (int i = 0; i < n - 1; i++) {
            if (pmax[i] <= smin[i + 1])
                chunks++;
        }
        return ++chunks;
    }

    public static void main(String[] args) {
        // Take custom input by adding scanner class
        int arr[] = { 23, 10, 18, 27, 35, 48, 26, 52, 50, 64, 61 };
        System.out.println(maxChunksToSorted(arr));

    }

}