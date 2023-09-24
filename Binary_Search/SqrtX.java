package Binary_Search;

class Solution {
    public int mySqrt(int x) {
        int ans=0;
        int start=1;
        int end=x;
        while(start<=end){
            int mid=(start)+(end-start)/2;
            if(x/mid ==mid){
                return mid;
            }
            else if(x/mid<mid){
                end=mid-1;
            }
            else{
            start=mid+1;
            ans=mid;
        }
     }
    return ans;
    }
}
