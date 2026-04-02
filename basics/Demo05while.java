package com.JXUT.f_while;

public class Demo05while {
    public static void main(String[] args) {
        int mountain = 8844430;
        double paper =0.1;
        int count = 0;
        while(mountain>paper) {paper=paper*2;
            count++;
        }
        System.out.println("count = " + count);
    }
}
