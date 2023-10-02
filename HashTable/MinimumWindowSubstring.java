package HashTable;
//https://leetcode.com/problems/minimum-window-substring/
import java.util.*;
class Solution {
    public String minWindow(String s1, String s2) {
        String ans="";
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        int mCount=0;
        int dmCount=s2.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        int i=-1;
        int j=-1;
        while(true){
            boolean flag1=false;
            boolean flag2=false;
            while(i<s1.length()-1 && mCount<dmCount){
                flag1=true;
                i++;
                char ch=s1.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                if(map1.getOrDefault(ch,0)<=map2.getOrDefault(ch,0)){
                    mCount++;
                }
            }
            while(j<i && mCount==dmCount){
                flag2=true;
                String temp=s1.substring(j+1,i+1);
                if(ans.length()==0||temp.length()<ans.length()){
                    ans=temp;
                }
                j++;
                char ch=s1.charAt(j);
                if(map1.get(ch)==1){
                    map1.remove(ch);
                }else{
                    map1.put(ch,map1.get(ch)-1);
                }
                if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0)){
                    mCount--;
                }
            }
            if(flag1==false && flag2==false){
                break;
            }
        }
        return ans;
    }
}
