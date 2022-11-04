package org.example.algorithmHash;

import java.util.HashSet;
import java.util.Set;

public class kuaileshu {
    static public boolean isHappy(int n){
        Set set=new HashSet<>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
            n=getNextNumber(n);
        }
        return n==1;
    }

    private static int getNextNumber(int n) {
        int result=0;
        while(n>0){
            int tmp=n%10;
            result=result+tmp*tmp;
            n=n/10;
        }
        return result;
    }
}
