package String;

//https://leetcode.com/problems/find-the-difference/
class Solution {
    public char findTheDifference(String s, String t) {
    int c = 0;
    for(char cofs : s.toCharArray()){
        c ^= cofs;
    }
    for(char coft : t.toCharArray()){
        c ^= coft;
    }
    return (char)c;
    }
}