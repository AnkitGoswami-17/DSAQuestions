package String;
//https://leetcode.com/problems/longest-common-prefix/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int minLen=FindLength(strs,strs.length);
        char cur;
        for(int i=0;i<minLen;i++){
            cur=strs[0].charAt(i);

            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=cur ){
                    return ans;
                }
            }
            ans+=cur;
        }
    return ans;    
       
    }
    static int FindLength(String arr[],int n){
        int min=arr[0].length();
        for(int i=0;i<n;i++){
            if(arr[i].length()<min){
                min=arr[i].length();
            }
        }
        return min;
    }
}
