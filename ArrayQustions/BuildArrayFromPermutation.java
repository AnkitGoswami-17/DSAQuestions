package ArrayQustions;

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = n * (nums[nums[i]] % n) + nums[i];
        }
        for (int j = 0; j < n; j++) {
            nums[j] = nums[j] / n;
        }
        return nums;
    }
}