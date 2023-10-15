package String;

//https://leetcode.com/problems/decoded-string-at-index/
class Solution {
    public String decodeAtIndex(String S, int k) {
        long length = 0;
       for (int i = 0; i < S.length(); i++) {
           char ch = S.charAt(i);

           if (Character.isDigit(ch)) {
               length *= ch - '0';
           } else {
               length++;
           }
       } 
       for (int i = S.length() - 1; i >= 0; i--){
           char ch = S.charAt(i);
            k %= length;

           if (k == 0 && !Character.isDigit(ch)) {
               return ""+ch;
           }

           if (Character.isDigit(ch)) {
               length /= ch - '0';
           } else {
              length--; 
           }
       }
       return "";
    }
}
