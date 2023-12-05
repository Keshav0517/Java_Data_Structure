package com.ClassRoom;

import java.util.Scanner;

public class BitManuplation {
    public static int findBits(int a){
        int count=0;
        while(a>0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;
        }
        return count;
    }
    public static void main(String[] args){
        int a=12;
        int result=findBits(a);
        System.out.println("result="+result);


    }
}
