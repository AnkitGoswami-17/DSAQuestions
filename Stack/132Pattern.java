package Stack;

//https://leetcode.com/problems/132-pattern/
import java.util.*;
class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<int[]> stack = new Stack<>();
        int curMin = nums[0];
        for (int n : nums) {
            while (!stack.isEmpty() && n >= stack.peek()[0]) {
                stack.pop();
            }
            if (!stack.isEmpty() && n > stack.peek()[1]) {
                return true;
            }
            stack.push(new int[]{n, curMin});
            curMin = Math.min(curMin, n);
        }
        return false; 
    }
}
