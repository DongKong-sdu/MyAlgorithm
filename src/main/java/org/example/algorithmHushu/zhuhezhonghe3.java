package org.example.algorithmHushu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class zhuhezhonghe3 {
    static List<List<Integer>> result =new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();
    private static void backtracking(int n,int k,int startIndex,int sum){
        if(sum>n) return;
        if(path.size()==k){
            if(sum==n){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for(int i=startIndex;i<=9-(k-path.size())+1;i++){
            sum=sum+i;
            path.add(i);
            backtracking(n,k,i+1,sum);
            path.removeLast();
            sum=sum-i;
        }
    }
    public static List<List<Integer>> backtrackingresult(int n, int k){
        backtracking(n,k,1,0);
        return result;
    }
}
