package String;
//https://leetcode.com/problems/is-subsequence/
class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = 0;
        int j = 0;
        if(m == 0){
            return true;
        }
        while(i < n && j < m) {
            if(s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if(j == m){
                return true;
            }
            i++;
        }
        return false;
    }
}