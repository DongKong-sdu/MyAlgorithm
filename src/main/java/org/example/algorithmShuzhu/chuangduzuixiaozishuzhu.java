package org.example.algorithmShuzhu;

public class chuangduzuixiaozishuzhu {
    static public int minSubArrayLen(int s,int[] nums){
        int sum=0;
        int i=0;
        int result=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            sum=sum+nums[j];
            while(sum>=s){
                result=result<(j-i+1) ? result:(j-i+1);
                sum=sum-nums[i++];
            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }
}
