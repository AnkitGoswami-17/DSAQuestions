package ArrayQustions;
//https://leetcode.com/problems/product-of-array-except-self/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int[] ans=new int[n];
        left[0]=nums[0];
        right[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            left[i]=nums[i]*left[i-1];
        }
        for(int j=n-2;j>=0;j--){
            right[j]=right[j+1]*nums[j];
        }
        ans[0]=right[1];
        ans[n-1]=left[n-2];
        for(int i=1;i<n-1;i++){
            ans[i]=left[i-1]*right[i+1];
        }
        return ans;
    }
}
