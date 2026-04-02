package com.JXUT.b_Random;

import java.util.Random;

public class Demo01Randow {
    public static void main(String[] args) {
        Random random = new Random();
        int data = random.nextInt(100000);
        System.out.println(data);
    }
}
