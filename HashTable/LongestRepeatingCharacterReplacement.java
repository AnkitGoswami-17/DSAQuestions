package HashTable;
//https://leetcode.com/problems/longest-repeating-character-replacement/
class Solution {
    public int characterReplacement(String s, int k) {
        int N=s.length();
        int[] ch_count=new int[26];
        
        int start=0;
        int max_length=0;
        int max_count=0;

        for(int end=0;end<N;end++){
            ch_count[s.charAt(end)-'A']++;
            int current_ch_count=ch_count[s.charAt(end)-'A'];
            max_count=Math.max(max_count,current_ch_count);

            while(end-start-max_count+1>k){
               ch_count[s.charAt(start)-'A']--;  
               start++;
            }
            max_length=Math.max(max_length,end-start+1);
        }
        return max_length;
    }
}
