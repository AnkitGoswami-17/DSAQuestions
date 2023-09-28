package TwoPointers;
//https://leetcode.com/problems/sort-colors/
class Solution {
    public void sortColors(int[] nums) {
        int m=0,l=0,h=nums.length-1;
        while(m<=h){
            if(nums[m]==1){
                m++;
            }
            else if(nums[m]==0){
                swap(nums,m,l);
                m++;l++;
            }
            else if(nums[m]==2){
                swap(nums,m,h);
                h--;
            }
        }
    }
    static void swap(int[] arr,int num1,int num2){
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }
}
