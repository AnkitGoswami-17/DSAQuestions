package Stack;
//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
import java.util.*;
class Solution {
    public int minInsertions(String s) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (stack.isEmpty() || stack.peek() == 2) {
                    stack.push(2);
                }else {
                    stack.pop();
                    stack.push(2);
                    count++;
                }
            }
            else if (ch == ')')
            {
                if (stack.isEmpty()){
                    stack.push(1);
                    count++;
                }else if (stack.peek() == 1)
                stack.pop();
                else if (stack.peek() == 2){
                    stack.pop();
                    stack.push(1);
                }
            }
        }
            while (!stack.isEmpty()){
                count = count + stack.peek();
                stack.pop();
            }
        return count;
    }
}
