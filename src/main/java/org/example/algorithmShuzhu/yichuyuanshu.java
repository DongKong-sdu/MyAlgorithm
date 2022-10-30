package org.example.algorithmShuzhu;

public class yichuyuanshu {
    static public int removeElement(int[] array ,int val){
        int slow=0;
        for(int fast=0;fast<array.length;fast++){
            if(array[fast]!=val){
                array[slow]=array[fast];
                slow++;
            }
        }
        return slow;
    }
}
