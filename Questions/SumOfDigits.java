package com.ClassRoom.Questions;

public class SumOfDigits {
    public static void main(String[] args) {
        //using while
        int n=52;
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("sum:"+sum);

        //using for loop
        for ( ;n>0;n=n/10){
            int rem=n%10;
            sum=sum+rem;
        }
        System.out.println("sum by using for loop:"+sum);

    }

}
