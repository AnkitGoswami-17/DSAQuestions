package String;
//https://leetcode.com/problems/sorting-the-sentence/
import java.util.*;
class Solution {
    public String sortSentence(String s) {
    String str=Sort(s);
    char[] ch=str.toCharArray();
    String res="";
    for(int i=0;i<ch.length;i++){
        if(!Character.isDigit(ch[i])){
            res=res+ch[i];
        }
    }
    return res;
        
    }
    static String Sort(String arr){
        String[] s=arr.split(" ");
        Map<String,Integer> ans= new HashMap<>();
        for(String str: s){
            for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                ans.put(str, Character.getNumericValue(ch));
                }
            }
        }
        String[] temp=new String[s.length];
        for(Map.Entry<String,Integer> entry:ans.entrySet()){
            temp[entry.getValue()-1]=entry.getKey();
        }
        return (String.join(" ",temp)); 
    }
}