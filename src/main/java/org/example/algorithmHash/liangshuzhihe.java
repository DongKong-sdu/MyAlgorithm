package org.example.algorithmHash;

import java.util.HashMap;
import java.util.Map;

public class liangshuzhihe {
    static public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        if(nums==null||nums.length==0){
            return result;
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0]=map.get(target-nums[i]);
                result[1]=i;
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
