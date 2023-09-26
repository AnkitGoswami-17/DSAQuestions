package ArrayQustions;
//https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int newSum=0;
        for(int i=0;i<nums.length;i++){
            newSum+=nums[i];
            if(newSum>maxSum){
                maxSum=newSum;
            }
            if(newSum<0){
                newSum=0;
            }
        }
        return maxSum;
    }
}
