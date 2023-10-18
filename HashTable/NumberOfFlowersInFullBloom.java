package HashTable;
//https://leetcode.com/problems/number-of-flowers-in-full-bloom/
import java.util.*;
class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] sortedArray = Arrays.copyOf(people, people.length);
        Arrays.sort(sortedArray);

        PriorityQueue<Integer> end = new PriorityQueue<>();
        Map<Integer, Integer> count = new HashMap<>();

        Arrays.sort(flowers, Comparator.comparingInt(flower -> flower[0]));
        int i = 0;
        for (int person : sortedArray) {
            while (i < flowers.length && flowers[i][0] <= person) {
                end.offer(flowers[i][1]);
                i++;
            }
            while (!end.isEmpty() && end.peek() < person) {
                end.poll();
            }
            count.put(person, end.size());
        }
        int[] res = new int[people.length];
        for (int j = 0; j < people.length; j++) {
            res[j] = count.get(people[j]);
        }
        return res;
    }
}
