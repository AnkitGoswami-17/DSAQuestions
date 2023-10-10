package Math;
//https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/

class Solution {
    public int countOrders(int n) {
      long mod=1000000007;
      long ways=1;
      //int factorial=fact(n);
      for(int i=1;i<=n;i++){
          ways*=i;
          ways%=mod;
          ways*=((2*i)-1);
          ways%=mod;
      }  
      return (int)(ways % mod);
    }
}
