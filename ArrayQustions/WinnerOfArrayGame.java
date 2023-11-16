package ArrayQustions;
import java.util.Arrays;
//https://leetcode.com/problems/find-the-winner-of-an-array-game/

class Solution {
    public int getWinner(int[] arr, int k) {
        int max = Arrays.stream(arr).max().getAsInt(); 
        int n = arr.length;

        if ( k >= n) {
            return max;
        }
        int winner = arr[0];
        int streak = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > winner) {
                winner = arr[i];
                streak = 1;
            } else {
                streak++;
            }
            if (k == streak || winner == max) {
            return winner;
            }
        }
        return -1;
    }
}
