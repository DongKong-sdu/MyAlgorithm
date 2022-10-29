package org.example.algorithmHushu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class zhuhezhonghe2 {
    static List<List<Integer>> result =new ArrayList<>();
    static LinkedList path =new LinkedList();
    static boolean[] used;
    static private void backtracking(int[] candidates,int target,int startIndex,int sum){
        if(sum>target) return;
        if(sum==target){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<candidates.length&&sum+candidates[i]<=target;i++){
            if(i>0&&candidates[i-1]==candidates[i]&&used[i-1]==false){
                continue;
            }
            path.add(candidates[i]);
            sum=sum+candidates[i];
            used[i]=true;
            backtracking(candidates,target,i+1,sum);
            used[i]=false;
            sum=sum-candidates[i];
            path.removeLast();
        }
    }
    public static List<List<Integer>> backtrackingresult(int[] candidates, int target){
        used =new boolean[candidates.length];
        Arrays.fill(used,false);
        Arrays.sort(candidates);
        backtracking(candidates,target,0,0);
        return result;
    }
}
