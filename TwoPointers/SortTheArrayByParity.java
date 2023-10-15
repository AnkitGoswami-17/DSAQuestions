package TwoPointers;

//https://leetcode.com/problems/sort-array-by-parity/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i = 0;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (nums[i] % 2 == 0) {
                res[left] = nums[i];
                left++;
                i++;
            } else {
                res[right] = nums[i];
                right--;
                i++;
            }
        }
        return res;
    }
}
