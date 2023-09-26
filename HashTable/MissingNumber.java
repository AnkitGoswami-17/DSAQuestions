package HashTable;
//https://leetcode.com/problems/missing-number/description/
import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int index=0;index<nums.length;index++){
            if(index!=nums[index]){
                return index;
            }
        }
        return nums.length;
    }
}
