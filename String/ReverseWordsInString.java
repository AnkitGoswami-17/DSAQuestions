package String;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
class Solution {
    public String reverseWords(String s) {
        String ans = " ";
        for (String val : s.split(" ")){
            String newStr = reverse(val);
            ans += newStr;
        }
        return ans.trim();
    }
    public String reverse(String str) {
        String res = " ";
        for (int i = str.length()-1; i >= 0; i--){        
            res += str.charAt(i);
        }
        return res;
    }
}
