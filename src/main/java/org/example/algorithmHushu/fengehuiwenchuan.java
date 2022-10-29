package org.example.algorithmHushu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class fengehuiwenchuan {
    static List<List<String>> result =new ArrayList<>();
    static LinkedList<String> path = new LinkedList<>();
    static private boolean isPalindrome(String s,int startIndex,int end){
        for(int i=startIndex,j=end;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    static private void backtracking(String s,int startIndex){
        if(startIndex>=s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<s.length();i++){
            if(isPalindrome(s,startIndex,i)){
                String str =s.substring(startIndex,i+1);
                path.addLast(str);
            }else{
                continue;
            }
            backtracking(s,i+1);
            path.removeLast();
        }
    }
    static public List<List<String>>  backtrackingresult(String s){
        backtracking(s,0);
        return result;
    }
}
