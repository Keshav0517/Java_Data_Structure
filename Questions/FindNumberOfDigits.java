package com.ClassRoom;

import java.util.Arrays;

public class FindNumberOfDigits {
    public static void main(String[] args) {
        int x=14563;
        int res=findNumberOfDigits(x);
        System.out.println("Number of Digits:"+res);

        int res2=numberOfDigits(x);
        System.out.println("Number of Digits:"+res2);

        int y=1001;
        int res3=number_OfDigits(y);
        System.out.println("Result:"+res3);


    }

    //Trick
    public static int findNumberOfDigits(int x){

        return (int)(Math.log10(x))+1;
    }

    public static int number_OfDigits(int y){
        return (int)(Math.log10(y))+1;        //Also used for Binary numbers
    }

    //Without Trick
    public static int numberOfDigits(int x){
        int count=0;
        while (x > 0){
            count++;
            x=x/10;
        }
        return count;
    }
}
