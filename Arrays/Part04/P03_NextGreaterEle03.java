import java.util.Arrays;

class P03_NextGreaterEle03 {
    public static int nextGreaterElement(int n) {

        char arr[] = (n + "").toCharArray();
        int m = arr.length;

        int idx = -1;
        for (int i = m - 2; i >= 0; i--) {
            // looking for dip point
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }

        int smallestIdx = 0;
        if (idx == -1)
            return -1;

        else {
            // look up for next greater element of dip point value
            smallestIdx = idx + 1;
            for (int i = idx + 1; i < m; i++) {
                if (arr[i] > arr[idx] && arr[i] <= arr[smallestIdx]) {
                    smallestIdx = i;
                }
            }
        }

        // swapping dip and next greater of dip
        char temp = arr[idx];
        arr[idx] = arr[smallestIdx];
        arr[smallestIdx] = temp;

        // sorting the rest from the next index of dip index
        Arrays.sort(arr, idx + 1, m);

        long num = Long.parseLong(new String(arr));

        if (num > Integer.MAX_VALUE)
            return -1;
        else
            return (int) num;

    }

    public static void main(String[] args) {
        // Take custom input by adding Scanner class
        System.out.println(nextGreaterElement(12351));
    }
}