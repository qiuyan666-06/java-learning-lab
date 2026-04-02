package com.JXUT.e_for;

public class Demo04for {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){sum+=i;}

        }
        System.out.println("sum = " + sum);
    }
}
