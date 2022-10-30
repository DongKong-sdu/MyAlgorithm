package org.example.algorithmShuzhu;

public class youyushuzhupingfang {
    static public int[] youyushuzhupingfang(int[] nums){
        int len =nums.length;
        int left=0;
        int right=len-1;
        int resIndex=len-1;
        int[] result =new int[len];
        while(left<=right){
            if(nums[left]*nums[left]>=nums[right]*nums[right]){
                result[resIndex--]=nums[left]*nums[left];
                left++;
            }else {
                result[resIndex--]=nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
}
