package Graph;
//https://leetcode.com/problems/reconstruct-itinerary/
import java.util.*;
class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
      Map<String,PriorityQueue<String>> map=new HashMap<>();
      List<String> ans =new ArrayList<>();
      int n=tickets.size();

      for(int i=0;i<n;++i){
        String src=tickets.get(i).get(0);
        String dst=tickets.get(i).get(1);
        map.computeIfAbsent(src, k-> new PriorityQueue<>()).offer(dst);
      }

      Stack<String> stack =new Stack<>();
      stack.push("JFK");

      while(!stack.isEmpty()){
        String src=stack.peek();
        if(!map.containsKey(src) || map.get(src).isEmpty()){
          ans.add(src);
          stack.pop();
        }else{
        String dst = map.get(src).poll();
        stack.push(dst);
      }
    }
    Collections.reverse(ans);
    return ans;   
    }
}
