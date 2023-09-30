package Math;
//https://leetcode.com/problems/three-divisors/
class Solution {
    public boolean isThree(int N) {
        int count=0;
        for(int i=1;i<=N/2;i++){ 
                if(N%i==0){
                    count++;
            }
        }
        count++;
        return (count==3);
    }
}