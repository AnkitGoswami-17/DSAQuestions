package Graph;
//https://leetcode.com/problems/shortest-path-visiting-all-nodes/
import java.util.*;
class Solution {
    public int shortestPathLength(int[][] graph) {
        int n=graph.length;
        if(n==1){
            return 0;
        }
        int all=(1<<n)-1;
        Queue<Pair<Integer,Pair<Integer,Integer>>> q=new LinkedList<>();
        Set<Pair<Integer,Integer>> vis=new HashSet<>();
        for(int i=0;i<n;i++){
            int mask=(1<<i);
            q.add(new Pair<>(i,new Pair<>(0,mask)));
            vis.add(new Pair<>(i,mask));
        }
        while(!q.isEmpty()){
            Pair<Integer,Pair<Integer,Integer>> node=q.poll();
            int val=node.getKey(),dist=node.getValue().getKey(),mask=node.getValue().getValue();
            for(int nbr:graph[val]){
                int newMask=(mask|(1<<nbr));
                if(newMask==all){
                    return dist+1;
                }else if(vis.contains(new Pair<>(nbr,newMask))){
                continue;
                }
                else{
                    q.add(new Pair<>(nbr,new Pair<>(dist+1,newMask)));
                    vis.add(new Pair<>(nbr,newMask));
                }
            }
        }
        return 0;
    }
}
