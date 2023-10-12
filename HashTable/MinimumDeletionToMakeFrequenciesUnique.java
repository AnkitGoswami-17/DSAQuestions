package HashTable;
//https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/
import java.util.*;
class Solution {
    public static int minDeletions(String s) {
        int ans = 0;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        reverse(freq);
        int f = freq[0];
        for (int num : freq) {
            if (num > f) {
                if (f > 0)
                    ans += num - f;
                else
                    ans += num;
            }
            f = Math.min(f - 1, num - 1);
        }
        return ans;
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
