package com.JXUT.h_break_continue;

public class Demo01breakANDcontinue {
    public static void main(String[] args) {

        for(int i =0;i<+5;i++){
            if (i==3){
                break;//若达成条件,终止且不在进行下一次循环
                //continue;若达成条件,终止本次循环,并直接进行下一次循环
            }
            System.out.println("我爱java"+i);
        }
        ;

    }
}
