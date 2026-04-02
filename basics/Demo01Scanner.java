package com.JXUT.a_scanner;

import java.util.Scanner;

public class Demo01Scanner {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        System.out.println("data1 = " + data1);

        String data2 = sc.next();
        System.out.println("data2 = " + data2);
    }
}
