package HashTable;

//https://leetcode.com/problems/roman-to-integer/
import java.util.*;
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            if (i < s.length() - 1 && curr < map.get(s.charAt(i + 1))) {
            res -= curr; 
            } else {
                res += curr;
            }
        }
        return res;
    }
}
