package TwoPointers;
//https://leetcode.com/problems/squares-of-a-sorted-array/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int pos=nums.length-1;pos>=0;pos--){
            if(nums[end]>nums[start]){
                arr[pos]=nums[end];
                end--;
            }
            else{
                arr[pos]=nums[start];
                start++;
            }
        }
      return arr;
    }   
}
