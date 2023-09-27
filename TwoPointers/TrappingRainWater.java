package TwoPointers;

class Solution {
    public int trap(int[] height) {
        int res=0;
        int n=height.length;

        if(n==1){
            return 0;
        }
        for(int i=1;i<n-1;i++){
            int first=height[i];
            for(int j=0;j<i;j++){
                first=Math.max(first,height[j]);
            }

            int last=height[i];
            for(int j=i+1;j<n;j++){
                last=Math.max(last,height[j]);
            }
            res+=Math.min(first,last)-height[i];
        }
        return res;
    }
}
