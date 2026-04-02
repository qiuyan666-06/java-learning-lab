package com.JXUT.f_while;

public class Demo04while {
    public static void main(String[] args) {
        int i=1;
        int count=0;
        while(i<=100){
            i++;
            if(i%2==0){count++;}
        }
        System.out.println("count="+count);
    }
}
