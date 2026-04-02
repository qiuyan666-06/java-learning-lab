package com.JXUT.d_If;

import java.util.Scanner;

public class Demo02if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day=sc.nextInt();

        if (day==1){
            System.out.println("星期一");
        } else if (day==2) {
            System.out.println("星期二");
        } else if (day==3) {
            System.out.println("星期三");
        } else if (day==4) {
            System.out.println("星期四");
        } else if (day==5) {
            System.out.println("星期五");
        } else if (day==6) {
            System.out.println("星期六");
        } else if (day==7) {
            System.out.println("星期日");
        }else{
            System.out.println("无效,请输入1~7");}


    }
}
