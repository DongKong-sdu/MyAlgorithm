package org.example.algorithmZhifuchuan;

public class fanzhuanzifuchuan {
    static public void reverseString(char[] s){
        for(int left=0,right=s.length-1;left<right;right--,left++){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
        }
    }
}
