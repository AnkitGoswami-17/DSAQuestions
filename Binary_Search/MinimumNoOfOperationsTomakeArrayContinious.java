package Binary_Search;

//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/
import java.util.*;
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int uniqueLen = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueLen++] = nums[i];
            }
        }
        int res = n;
        int r = 0;
        for (int j = 0; j < uniqueLen; j++) {
            while (r < uniqueLen && nums[r] < nums[j] + n) {
                r += 1;
            }
            int window = r - j;
            res = Math.min(res, n - window);
        }
        return res;
    }
}
