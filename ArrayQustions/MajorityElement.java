package ArrayQustions;
//https://leetcode.com/problems/majority-element/
class Solution {
    public int majorityElement(int[] nums) {
        int n=0;
        int count=0;
        for(int element:nums){
            if(count==0){
                n=element;
            }
            if(element==n){
                count++;
            }
            else{
                count--;
            }
        }
        return n;
    }
}