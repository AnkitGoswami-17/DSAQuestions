package String;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
import java.util.*;
class Solution {
    public List<String> letterCombinations(String digits) {
    ArrayList<String> list= new ArrayList<>();
    if(digits.isEmpty()) return list;
    return numpad("",digits);
    }
    static ArrayList<String> numpad(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
        int i =(digit-2)*3;
        if(digit>7) i+=1;
            int len=i+3;
            if(digit==7||digit==9) len+=1;
        for(;i<len;i++){
            char ch=(char)('a'+i);
           ans.addAll(numpad(p+ch,up.substring(1)));
        }
        return ans;
    }
}
