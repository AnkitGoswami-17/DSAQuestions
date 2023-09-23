package ArrayQustions;

class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=nums[i];
            nums[i]=ans;
            
        }
        return nums;
    }
}