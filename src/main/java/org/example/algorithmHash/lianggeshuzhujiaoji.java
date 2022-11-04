package org.example.algorithmHash;

import java.util.HashSet;
import java.util.Set;

public class lianggeshuzhujiaoji {
    static public int[] lianggeshuzhujiaoji(int[] nums1,int[] nums2){
        Set set1=new HashSet<>();
        Set resultSet=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(set1.contains(nums2[j])){
                resultSet.add(nums2[j]);
            }
        }
        return resultSet.stream().mapToInt(x-> (int) x).toArray();
    }
}
