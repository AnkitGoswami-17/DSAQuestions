package HashTable;
//https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/

import java.util.*;
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;

        List<List<Integer>> ans = new ArrayList();
        Map<Integer,List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++){
            List<Integer> list = map.computeIfAbsent(groupSizes[i], 
            k -> new ArrayList());
            list.add(i);

            if (list.size() == groupSizes[i]){
                ans.add(list);
                map.put(groupSizes[i], new ArrayList());
            }
        }
        return ans;
    }
}
