package com.JXUT.d_If;

import java.util.Scanner;

public class Demo03if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        /*if(age>=0&&age<=6){
          System.out.println("婴幼儿");
      } else if (age>=7&&age<=12) {
            System.out.println("少儿");

        } else if (age>=12&&age<=17) {
            System.out.println("青少年");

        }else if (age>=18&&age<=45) {
            System.out.println("青年");
        } else if (age>=46&&age<=69) {
            System.out.println("中年");

        }else if (age>=69&&age<=130) {
            System.out.println("老年");
        }*/
        if(age<0||age>130){
            System.out.println("年龄不符合实际");

        }
    }
}
