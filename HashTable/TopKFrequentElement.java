package HashTable;
//https://leetcode.com/problems/top-k-frequent-elements/
import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       List<Integer>[] bucket=new List[nums.length+1];
       Map<Integer,Integer> fmap=new HashMap<>();
       for(int n:nums){
           fmap.put(n,fmap.getOrDefault(n,0)+1);
       }
       for(int key:fmap.keySet()){
           int frequency=fmap.get(key);
           if(bucket[frequency]==null){
               bucket[frequency]=new ArrayList<>();
           }
        bucket[frequency].add(key);
       }
       int[] res=new int[k];
       int count=0;
       for(int pos=bucket.length-1;pos>=0 && count<k;pos--){
           if(bucket[pos]!=null){
               for(Integer element:bucket[pos]){
                   res[count++]=element;
               }
           }
       }
       return res;
    }
}
