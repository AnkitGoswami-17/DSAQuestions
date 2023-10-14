package String;

//https://leetcode.com/problems/remove-duplicate-letters/
import java.util.*;
class Solution {
    public String removeDuplicateLetters(String s) {
          int n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
      Stack<Character> stack = new Stack<>();
      boolean[] visited = new boolean[26];
      for (int i = 0; i < n; i++) {
          if (visited[s.charAt(i) - 'a']) {
              freq[s.charAt(i) - 'a']--;
              continue;
          }
          while (!stack.isEmpty() && stack.peek() > s.charAt(i)
                     && freq[stack.peek() - 'a'] > 0) {
              visited[stack.peek() - 'a'] = false;
              stack.pop();
          }
        stack.push(s.charAt(i));
        visited[s.charAt(i) - 'a'] = true;
        freq[s.charAt(i) - 'a']--;
      }
      StringBuilder res = new StringBuilder();
      while (!stack.isEmpty()) {
          res.append(stack.pop());
      }
    return res.reverse().toString();
    }
}
