package PrefixSum;
//https://leetcode.com/problems/find-pivot-index/
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        int leftSum=0;
        int rightSum=0;
       for(int i=0;i<nums.length;i++){
           totalSum+=nums[i];
       }
        for(int j=0;j<nums.length;j++){
            rightSum=totalSum-nums[j]-leftSum;
            if(rightSum==leftSum){
                return j;
            }
            leftSum+=nums[j];
       }
    return -1;
    }
}
