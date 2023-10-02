package ArrayQustions;
//https://leetcode.com/problems/longest-consecutive-sequence/description/
import java.util.*;
class Solution {
    public int longestConsecutive(int[] arr) {
       // if(arr.length<=1) return
       Arrays.sort(arr);
       int Last_smaller=Integer.MIN_VALUE;
       int longest=0;
       int currCount=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]-1==Last_smaller){
            currCount+=1;
            Last_smaller=arr[i];
        }
        else if(arr[i]!=Last_smaller){
            currCount=1;
            Last_smaller=arr[i];
        }
        longest=Math.max(longest,currCount);
    }
    return longest;
    }
}