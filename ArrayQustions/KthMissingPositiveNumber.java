package ArrayQustions;
//https://leetcode.com/problems/kth-missing-positive-number/
class Solution {
    public int findKthPositive(int[] arr, int k) {
   /* HashMap<Integer,Integer> nmap = new HashMap<>();
        int count=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            nmap.put(arr[i],1);
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=min;i<=max;i++){
            if(nmap.get(i)==null)count++;
            if(count==k) return i;
        }
        return -1;*/

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]-mid-1<k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start+k;
    }
}
