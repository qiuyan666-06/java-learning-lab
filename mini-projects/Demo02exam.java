package com.JXUT.j_exam;

import java.util.Random;
import java.util.Scanner;

public class Demo02exam {
    public static void main(String[] args) {
        System.out.println("请你猜一个数字");
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int rdNumber = random.nextInt(100);
        while(true){
            int scNumber = sc.nextInt();
            if(rdNumber<scNumber){
                System.out.println("猜大了");
            } else if (rdNumber>scNumber) {
                System.out.println("猜小了");

            } else if (rdNumber==scNumber) {
                System.out.println("猜对了");break;

            }
        }
    }
}
