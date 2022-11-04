package org.example.algorithmHash;

public class youxiaozimuyiweichi {
    static public boolean youxiaozimuyiweichi(String s,String t){
        int[] record=new int[26];
        for(int i=0;i<s.length();i++){
            record[s.charAt(i)-'a']++;
        }
        for(int j=0;j<t.length();j++){
            record[t.charAt(j)-'a']--;
        }
        for(int m=0;m< record.length;m++){
            if(record[m]!=0){
                return false;
            }
        }
        return true;
    }
}
