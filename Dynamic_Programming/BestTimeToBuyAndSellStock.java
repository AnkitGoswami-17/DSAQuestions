package Dynamic_Programming;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int lbv=Integer.MAX_VALUE;
        int ovProfit=0;
        int prftTdy=0;

        for(int i=-0;i<n;i++){
            if(prices[i]<lbv){
                lbv=prices[i];
            }
            prftTdy=prices[i]-lbv;
            if(ovProfit<prftTdy){
                ovProfit=prftTdy;
            }
        }
        return ovProfit;
    }
}
