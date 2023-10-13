package ArrayQustions;
//https://leetcode.com/problems/find-the-duplicate-number/
import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        int len=nums.length;
        Set<Integer> set =new HashSet<>();
        for(int i=0;i<len;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return len;
    }
}
