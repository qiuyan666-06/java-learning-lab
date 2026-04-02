package com.JXUT.a_scanner.logic;

public class Demo01Logic {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 10;


        boolean result01 = (i > k)  &&  (i == k);
        System.out.println("result01="+result01);
        boolean result02 = (i > j)  ||  (i == k);
        System.out.println("result02="+result02);
        boolean result03 = (i > j)  ^  (i == k);
        System.out.println("result03="+result03);
        boolean result04 = !(i > j);
        System.out.println("result04="+result04);
    }
}
