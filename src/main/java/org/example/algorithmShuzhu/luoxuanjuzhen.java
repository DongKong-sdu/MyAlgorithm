package org.example.algorithmShuzhu;

public class luoxuanjuzhen {
    static public int[][] generateMatrix(int n){
        int loop=n/2;
        int x=0;
        int y=0;
        int sub=1;
        int[][] result =new int[n][n];
        int count=1;
        int i;
        int j;
        while(loop-->0){
            for(j=y;j<n-sub;j++){
                result[x][j]=count++;
            }
            for(i=x;i<n-sub;i++){
                result[i][j]=count++;
            }
            for(;j>y;j--){
                result[i][j]=count++;
            }
            for(;i>x;i--){
                result[i][j]=count++;
            }
            x++;
            y++;
            sub++;
        }
        if(n%2==1){
            result[n/2][n/2]=count;
        }
        return result;
    }
}
