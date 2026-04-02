package com.JXUT.a_scanner.logic;

public class Demo02Logic {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
       // boolean result01 = (++i > 100)&(++j > 10);
        boolean result01 = (++i > 100)&&(++j > 10);

        System.out.println("result01="+result01);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
