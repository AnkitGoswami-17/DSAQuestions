package String;
//https://leetcode.com/problems/valid-anagram/description/
class Solution {
    public boolean isAnagram(String str1, String str2) {
         str1=str1.toLowerCase();
         str2=str2.toLowerCase();

        str1.replace(" ","");
        str2.replace(" ","");

        int[] count=new int[26];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            count[str2.charAt(i)-'a']--;
        }

        for(int num:count){
            if(num!=0) return false;
        }
        return true;
    }
}
