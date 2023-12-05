package com.ClassRoom.Questions;

public class Even_Odd {
    public static void main(String[] args) {
        int n=10;
        /*
        if((n&1)==0){      //conditions-->(n%2==0),(n/2)*2==n,(n>>1)<<1==n,(n>>1)*2==n
            System.out.println("Even");
        }
        else
            System.out.println("odd");

         */

        if(((n^1)|1)==n)        //using XOR operator
            System.out.println("odd");
        else
            System.out.println("even");
    }
}
