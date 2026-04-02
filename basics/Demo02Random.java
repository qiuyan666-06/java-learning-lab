package com.JXUT.b_Random;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random random = new Random();
        //在1到10之间随机
        int data = random.nextInt(10)+1;
        System.out.println("data = " + data);

        System.out.println("===================");
        //在100到999之间随机
        int data1 = random.nextInt(900)+100;
        System.out.println("data1 = " + data1);
    }
}
