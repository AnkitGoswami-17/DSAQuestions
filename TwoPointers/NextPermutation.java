package TwoPointers;
//https://leetcode.com/problems/next-permutation/
class Solution {
    public void nextPermutation(int[] nums) {
     int n=nums.length;
        int idx1=-1;
        int idx2=-1;
        if(n==1){
            return;
        }
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1=i;
                break;
            }
        }
        if(idx1<0){
            reverse(nums,0,nums.length-1);
        }
        else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[idx1]){
                   idx2=i;
                   break;
                }
            }
            swap(nums,idx1,idx2);
            reverse(nums,idx1+1,nums.length-1);
            }
        }
            public void swap(int[] arr,int first,int second){
                int temp=arr[first];
                arr[first]=arr[second];
                arr[second]=temp;
            }
         public void reverse(int[] arr1,int start,int end){
            while(start<=end){
                 swap(arr1,start,end);
                 start++;
                 end--;
         }
    }
}
