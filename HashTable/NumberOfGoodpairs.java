package HashTable;

//https://leetcode.com/problems/number-of-good-pairs/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        // Approach-1
    //     int count = 0;
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if (map.containsKey(nums[i])) {
    //             if (map.get(nums[i]) > 1) {
    //                 count = count + map.get(nums[i]);
    //                 map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
    //             } else {
    //                 count++;
    //                 map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
    //             }
    //         } else {
    //             map.put(nums[i], 1);
    //         }
    //     }
    //     return count;
    // }
    //Approach-2
    int count=0;
    int[] freq = new int[102];
    for (int num : nums) {
        freq[num]++;
    }
    for(int n : freq) {
        count += (n*(n-1))/2;
    }
    return count;
    }
}
