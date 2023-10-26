package Binary_Search;

class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int sum = 0, max = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        int low = max, high = sum, res = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isFeasible(arr, days, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    static boolean isFeasible(int[] arr, int k, int ans) {
        int n = arr.length;
        int req = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > ans) {
                req++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return (req <= k);
    }
}