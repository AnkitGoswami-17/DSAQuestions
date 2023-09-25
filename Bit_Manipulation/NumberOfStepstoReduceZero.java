package Bit_Manipulation;

class Solution {
    public int numberOfSteps(int num) {
        return extra(num, 0);
    }

    private static int extra(int n, int steps) {
        if (n == 0) {
            return steps;
        }
        if ((n & 1) == 0) {
            return extra(n / 2, steps + 1);
        }
        return extra(n - 1, steps + 1);
    }
}