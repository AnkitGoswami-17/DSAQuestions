package Matrix;
//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
import java.util.*;
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] countOnes = new int[m][2];
        for(int row = 0; row < m; row++){
            int numOnes = binarySearch(mat[row], 0, n-1);
            countOnes[row] = new int[]{numOnes,row};
        }
        Arrays.sort(countOnes, (a,b) -> {
            if (a[0] != b[0]){
                return Integer.compare(a[0], b[0]);
            }else{
                return Integer.compare(a[1], b[1]);
            }
        });

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = countOnes[i][1];
        }

        return result;
    }
    private int binarySearch(int[] arr,int l,int h){
        int mid;
        int result = -1;
        while(l <= h){
            mid = l + (h - l) / 2;
            if (arr[mid] == 1){
                result = mid; 
                l = mid + 1;
            }else if (arr[mid] == 0){
                h = mid - 1;
            }
        }
        return result + 1;
    }
}
