package ArrayQustions;
import java.util.Arrays;
//https://leetcode.com/problems/eliminate-maximum-number-of-monsters/

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int count = 1;
        int time[] = new int[n];

        for(int i = 0; i < n; i++) {
            double val = ((double)dist[i]/(double)speed[i]);
            time[i] = (int)Math.ceil(val);
        }
        Arrays.sort(time);
        for (int i = 1; i < n ; i++) {
            if(time[i] - count == 0) {
                return count;
            }
            count += 1;
        }
        return count;
    }
}
