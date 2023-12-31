package String;
//https://leetcode.com/problems/intersection-of-two-arrays-ii/
import java.util.*;
class Solution {
   static int[] intersect(int[] nums1, int[] nums2) {
       // ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else{
                nums1[k++]=nums1[i];
                ++i;
                ++j;
            }
        }
        int[] arr=new int[k];
        for(i=0;i<k;i++){
            arr[i]=nums1[i];
        }
      return arr;
    }   
}
