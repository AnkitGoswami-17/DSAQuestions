package HashTable;
//https://leetcode.com/problems/intersection-of-two-arrays/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp= new int[1000];
        int count=0;
        for(int i=0;i<nums1.length;i++){
            temp[nums1[i]]=1;
        }
        for(int j=0;j<nums2.length;j++){
            if(temp[nums2[j]]==1){
                temp[nums2[j]]=2;
                count++;
            }
        }
        int[] ans=new int[count];
        for(int i=0,j=0; i<temp.length && j<count;i++){
            if(temp[i]==2){
                ans[j]=i;
                j++;
            }
        }
        return ans;
    }
}
