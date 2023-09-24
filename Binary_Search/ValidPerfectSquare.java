package Binary_Search;

class Solution {
    public boolean isPerfectSquare(int num) {
        int s=0;
        int e=num;
        while(s<=e){
            if(e==1){
                return true;
            }
            long m=s+(e-s)/2;
            if(m*m==num){
                return true;
            }
            else if(num>m*m){
                s=(int)m+1;
            }
            else{
                e=(int)m-1;
            }
        }
        return false;
    }
}
