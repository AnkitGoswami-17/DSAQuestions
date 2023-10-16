package String;

//https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/
class Solution {
    public boolean winnerOfGame(String colors) {
        int alice = 0,bob = 0;
        int left = 0;
        for (int right = 0; right < colors.length(); right++) {
            if (colors.charAt(left) != colors.charAt(right)) {
                left = right;
            }
            
            if (right - left > 1) {
                if (colors.charAt(right) == 'A') {
                    alice += 1;
                }
                if (colors.charAt(right) == 'B') {
                    bob += 1;
                }
            }
        }
        return alice > bob;
    }
}
