package org.example;

import org.example.algorithmHushu.dianhuahaomazimuzhuhe;
import org.example.algorithmHushu.fengehuiwenchuan;
import org.example.algorithmHushu.zhuhezhonghe;
import org.example.algorithmHushu.zhuhezhonghe2;
import org.example.algorithmShuzhu.erfenchazhao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import static org.example.ImageBase64Util.base64ToFile;

public class Main {
    public static void main(String[] args) throws Exception {
        //斐波那契数列
//        System.out.println(fib.fib(9));
        //爬楼梯
//        System.out.println(palouti.palouti(4));
        //最小花费爬楼梯
//        int[] cost=new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
//        System.out.println(zuixiaohuafeipalouti.zuixiaohuafeipalouti(cost));
        //不同路径
//        System.out.println(butonglujing.butonglujing(3,3));
        //不同路径2
//        int[][] obstacleGrid =new int[][]{{0,0,0},{0,1,0},{0,0,0}};
//        System.out.println(butonglujing2.butonglujing2(obstacleGrid));
        //整数拆分
//        System.out.println(zhengshucaifen.zhengshucaifen(8));
        //不同的二叉搜索树
//        System.out.println(butongdeerchashousuoshu.butongdeerchashousuoshu(5));
        //组合问题
//        System.out.println(zhuhewenti.combine(4,2));
        //组合总和三
//        System.out.println(zhuhezhonghe.backtrackingresult(7,3));
        //电话号码的字母组合
//        System.out.println(dianhuahaomazimuzhuhe.backtrackingresult("23"));
        //组合总和
//        int[] c=new int[]{2,3,6,7};
//        System.out.println(zhuhezhonghe.backtrackingresult(c,7));
        //组合总和2
//        int[] c=new int[]{2,5,2,1,2};
//        System.out.println(zhuhezhonghe2.backtrackingresult(c,5));
        //分割回文串
//        String s="aab";
//        System.out.println(fengehuiwenchuan.backtrackingresult(s));
//        String imagestr="data:image/png;base64,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";
//        File file=base64ToFile(imagestr);
//        InputStream inputStream = new FileInputStream(file);
//        System.out.println("getFinishPicFile "+file.getName());
//        System.out.println("getFinishPicFile "+file.length());
          int[] c=new int[]{-1,0,3,5,9,12};
          System.out.println(erfenchazhao.search(c,2));
    }

}
