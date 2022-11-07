package org.example.algorithmHash;

import java.util.HashMap;
import java.util.Map;

public class sishuxiangjia2 {
    static public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(map.containsKey(nums1[i]+nums2[j])){
                    int value=map.get(nums1[i]+nums2[j]);
                    value++;
                    map.put(nums1[i]+nums2[j],value);
                }else {
                    map.put(nums1[i]+nums2[j],1);
                }
            }
        }
        int res=0;
        for(int m=0;m<nums3.length;m++){
            for(int n=0;n<nums4.length;n++){
                if(map.containsKey(-nums3[m]-nums4[n])){
                    res=res+map.get(-nums3[m]-nums4[n]);
                }
            }
        }
        return res;
    }
}
