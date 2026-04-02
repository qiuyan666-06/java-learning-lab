package com.JXUT.a_scanner.ternary;

public class Demo03Ternary {
    public static void main(String[] args) {
        int old1 = 60;
        int old2 = 70;
        int old3 = 80;
        int max = old1 > old2 ? old1 : old2;
        int max2 = max > old3 ? max : old3;
        System.out.println("max = " + max2);
        int max3 = old1>old2?(old1>old3?old1:old3):(old2>old3?old2:old3);
        System.out.println("max3 = " + max3);

 }
}

