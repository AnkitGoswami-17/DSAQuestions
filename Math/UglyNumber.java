package Math;
//https://leetcode.com/problems/ugly-number/
class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        n=primeFactor(n,2);
        n=primeFactor(n,3);
        n=primeFactor(n,5);
        return (n==1);
    }
    static int primeFactor(int n,int x){
        while(n%x==0){
            n/=x;
        }
        return n;
    }
}
