package String;

//https://leetcode.com/problems/longest-string-chain/
import java.util.*;
class Solution {
    static boolean compare(String s1, String s2) {
        if(s1.length() != s2.length() + 1)
        return false;
        int first = 0;
        int second = 0;
        while(first < s1.length()) {
            if(second < s2.length() && 
            s1.charAt(first) == s2.charAt(second)) {
                first++;
                second++;
            }else {
                first++;
            }
        }
        return first == s1.length() && second == s2.length();
    }
    public int longestStrChain(String[] words) {
        int n = words.length;
        Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxi = 1;
        for(int i = 0; i < n; i++) {
            for(int prev_idx = 0; prev_idx < i; prev_idx++) {
                if(compare(words[i], words[prev_idx]) && 1 + dp[prev_idx] > dp[i]) {
                    dp[i] = 1 + dp[prev_idx];
                }
            }
            if(dp[i] > maxi) {
                maxi = dp[i];
            }
        }
        return maxi;
    }
}
