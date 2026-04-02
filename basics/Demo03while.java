package com.JXUT.f_while;

public class Demo03while {
    public static void main(String[] args) {
        int i=1;
        int sun=0;
        while(i<=100){
            i++;if(i%2==0){
                sun+=i;
            }
        }
        System.out.println("sun="+sun);
    }
}
