package ArrayQustions;

//https://leetcode.com/problems/monotonic-array/
class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        if (n == 1) {
            return true;
        }
        if (nums[1] >= nums[0]) {
            for (int i = 2; i < n; i++) {
                if (nums[i] >= nums[i - 1]) {
                    count1 += 1;
                    continue;
                }
            }
        }
        if (nums[1] <= nums[0]) {
            for (int i = 2; i < n; i++) {
                if (nums[i] <= nums[i - 1]) {
                    count2 += 1;
                    continue;
                }
            }
        }
        int count = Math.max(count1, count2);
        if (count == n - 2) {
            return true;
        }
        return false;
    }
}
