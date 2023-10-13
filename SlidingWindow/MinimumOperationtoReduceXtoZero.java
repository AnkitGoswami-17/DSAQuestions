package SlidingWindow;
//https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/
class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int sum=0;
        boolean found=false;
        for(int num:nums){
            sum+=num;
        }
        int target=sum-x;
        int i=0;
        int currentSum=0;
        int maxLen=Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
            currentSum+=nums[j];
            while(i<=j && currentSum>target){
                currentSum-=nums[i];
                i+=1;
            }
            if(currentSum==target){
                found=true;
                maxLen=Math.max(maxLen,j-i+1);
            }
        }
        return found?n-maxLen:-1;
    }
}
