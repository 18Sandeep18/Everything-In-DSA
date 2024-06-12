import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        int val1 = nums[0];
        int cnt1 = 1;
        int val2 = nums[0];
        int cnt2 = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] == val1)
                cnt1++;
            else if (nums[i] == val2)
                cnt2++;
            else if (cnt1 == 0) {
                val1 = nums[i];
                cnt1++;
            } else if (cnt2 == 0) {
                val2 = nums[i];
                cnt2++;
            } else if (val1 != nums[i] && val2 != nums[i]) {
                cnt1--;
                cnt2--;
            }
        }

        int candidate1 = 0;
        int candidate2 = 0;

        for (int i = 0; i < n; i++) {
            if (val1 == nums[i])
                candidate1++;
            else if (val2 == nums[i])
                candidate2++;
        }
        if (candidate1 > n / 3) {
            ans.add(val1);
        }
        if (candidate2 > n / 3) {
            ans.add(val2);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3, 1, 4, 5, 2, 3, 2, 2 };
        List<Integer> ans = majorityElement(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}