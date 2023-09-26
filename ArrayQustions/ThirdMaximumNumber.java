package ArrayQustions;
//https://leetcode.com/problems/third-maximum-number/
import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int index = n - 1 , i , Count = 0;
        while(index >= 0)
        {
            Count++;
            i = index - 1;
            while(i >= 0 && nums[i] == nums[index])
                i--;
            if(i == -1)
                return nums[n - 1];
            index = i;
            if(Count == 2)
                return nums[index];
        }
        return -1;
    }
}