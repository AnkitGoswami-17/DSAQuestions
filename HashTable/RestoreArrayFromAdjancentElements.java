package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RestoreArrayFromAdjancentElements {
    public static void main(String[] args) {
        int[][] arr = { { 2, 1 }, { 3, 4 }, { 3, 2 } };
        System.out.println(Arrays.toString(restoreArray(arr)));
    }

    public static int[] restoreArray(int[][] adjacentPairs) {
        var map = new HashMap<Integer, List<Integer>>();

        for (var pair : adjacentPairs) {
            map.putIfAbsent(pair[0], new ArrayList<>());
            map.putIfAbsent(pair[1], new ArrayList<>());

            map.get(pair[0]).add(pair[1]);
            map.get(pair[1]).add(pair[0]);
        }
        var ans = new int[adjacentPairs.length + 1];

        for (var entry : map.entrySet()) {
            if (entry.getValue().size() == 1) {
                ans[0] = entry.getKey();
                ans[1] = entry.getValue().get(0);
                break;
            }
        }
        for (var i = 2; i < ans.length; i++) {
            var a = map.get(ans[i - 1]);
            ans[i] = a.get(0) == ans[i - 2] ? a.get(1) : a.get(0);
        }
        return ans;
    }
}