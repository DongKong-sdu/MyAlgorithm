package org.example.algorithmShuzhu;

public class erfenchazhao {
    static public int  search(int[] nums,int target){
        int len = nums.length;
        int left =0;
        int right= len-1;
        if(target<nums[0]||target>nums[len-1]){
            return -1;
        }
        while(left<=right){
            int mid=left+((right-left)>>1);

            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                right=mid-1;
            } else if (nums[mid]<target) {
                left=mid+1;
            }
        }
        return -1;
    }
}
