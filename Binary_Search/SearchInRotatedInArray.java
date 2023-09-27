package Binary_Search;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
class Solution {
    public int search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int mid=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>=arr[start]){
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target<=arr[end] && target>arr[mid]){
                    start=mid+1;
                }
                else{
                end=mid-1;
                }
            }
        }  
        return -1;    
    }
}
