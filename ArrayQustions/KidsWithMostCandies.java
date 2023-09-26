package ArrayQustions;

import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l1 = new ArrayList<>();
        int n = candies.length;
        int greatest = 0;
        for (int i = 0; i < n; i++) {
            if (candies[i] > greatest) {
                greatest = candies[i];
            }
        }
        for (int i = 0; i < n; i++) {
            l1.add(candies[i] + extraCandies >= greatest);
        }
        return l1;
    }

}
