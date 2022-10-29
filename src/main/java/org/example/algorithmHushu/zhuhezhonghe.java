package org.example.algorithmHushu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class zhuhezhonghe {
    static List<List<Integer>> result =new ArrayList<>();
    static LinkedList path =new LinkedList();
    static private void backtracking(int[] candidates,int target,int startIndex,int sum){
        if(sum>target) return;
        if(sum==target){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<candidates.length&&sum+candidates[i]<=target;i++){
            path.add(candidates[i]);
            sum=sum+candidates[i];
            backtracking(candidates,target,i,sum);
            sum=sum-candidates[i];
            path.removeLast();
        }
    }
    public static List<List<Integer>> backtrackingresult(int[] candidates, int target){
        backtracking(candidates,target,0,0);
        return result;
    }
}
