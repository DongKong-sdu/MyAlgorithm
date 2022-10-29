package org.example.algorithmHushu;

import java.util.ArrayList;
import java.util.List;

public class dianhuahaomazimuzhuhe {
    static List<String> list =new ArrayList<>();
    static StringBuilder temp =new StringBuilder();

    private static void backtracking(String digits,String[] numString,int num){
        if(num==digits.length()){
            list.add(temp.toString());
            return;
        }
        String str = numString[digits.charAt(num)-'0'];
        for(int i=0;i<str.length();i++){
            temp.append(str.charAt(i));
            backtracking(digits,numString,num+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public static List<String> backtrackingresult(String digits){
        if(digits==null||digits.length()==0){
            return list;
        }
        String[] numString = {"","","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtracking(digits,numString,0);
        return list;
    }
}
