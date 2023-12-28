package HashTable;
//https://leetcode.com/problems/unique-length-3-palindromic-subsequences/
import java.util.*;
class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            letters.add(s.charAt(i));
        }
        
        int res = 0;
        for (char letter : letters) {
             int left_idx = -1;
             int right_idx = -1;
            
            for (int i = 0; i < n; i++) {
                if(s.charAt(i) == letter) {
                    if(left_idx == -1) {
                        left_idx = i;
                    }
                    right_idx = i;
                }
            }
            Set<Character> set = new HashSet<>();
            for (int mid = left_idx + 1; mid < right_idx ; mid++) {
                set.add(s.charAt(mid));
            }
            res += set.size();
        }
        return res;
    }
}