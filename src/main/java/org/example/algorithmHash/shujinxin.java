package org.example.algorithmHash;

import java.util.HashSet;
import java.util.Set;

public class shujinxin {
    static public boolean canConstruct(String ransomNote, String magazine){
        int[] record = new int[26];
        for(char mag:magazine.toCharArray()){
            record[mag-'a']++;
        }
        for(char ran:ransomNote.toCharArray()){
            record[ran-'a']--;
        }
        for(int r:record){
            if(r<0){
                return false;
            }
        }
        return true;
    }
}
