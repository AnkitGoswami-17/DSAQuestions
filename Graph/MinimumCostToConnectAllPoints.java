package Graph;
//https://leetcode.com/problems/min-cost-to-connect-all-points/
import java.util.*;
import javafx.util.Pair;
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int v=points.length;

        List<List<Pair<Integer,Integer>>> adj =new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        } 
        for(int i=0;i<v;i++){
            for(int j=i+1;j<v;j++){
                int x1=points[i][0];
                int y1=points[i][1];

                int x2=points[j][0];
                int y2=points[j][1];

                int d=Math.abs(x1-x2)+Math.abs(y1-y2);
                adj.get(i).add(new Pair<>(j,d));
                adj.get(j).add(new Pair<>(i,d));

            }
        }
        return minMST(adj,v);
    }
    public int minMST(List<List<Pair<Integer,Integer>>> adj,int V){
        PriorityQueue<Pair<Integer,Integer>> pq =new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));
        pq.offer(new Pair<>(0,0));
        boolean[] inMST=new boolean[V];
        int sum=0;

        while(!pq.isEmpty()){
            Pair<Integer,Integer> p=pq.poll();
            int wt=p.getKey();
            int node=p.getValue();

            if(inMST[node]){
                continue;
            }

            inMST[node]=true;
            sum+=wt;

            for(Pair<Integer,Integer> tmp:adj.get(node)){
                int neighbor=tmp.getKey();
                int neighbor_wt=tmp.getValue();

                if(!inMST[neighbor]){
                    pq.offer(new Pair<>(neighbor_wt,neighbor));
                }
            }
        }
        return sum;
    }
}
