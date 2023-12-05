package com.ClassRoom.Questions;

public class CheckPrime {
    public static void main(String ...args) {

        // 1]WAP to find a prime or not with count variable
        int n=7;
        int div=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                div++;
            }
        }
        if (div==2){
            System.out.println("Prime");
        }
        else
            System.out.println("Not Prime");



        /*

       // 2]WAP to find a prime number of an given no without count variable-->optimized way

        int n1=5;
        for (int i=2;i<n1/2;i++){
            if (n1%i == 0) {
                System.out.println("not prime");
                break;
            }
        }
        if (n1/2==i){
            System.out.println("prime");
        }

         */


        // 3]WAP to find a prime number of an given no with count variable-->optimized way
        int n2=6;
        int div2=0;
        for (int i=2;i<=n2/2;i++){
            if (n2%i==0){
                div2++;
            }
        }
        if (div2==0){
            System.out.println("Prime");
        }
        else
            System.out.println("Not Prime");


    }
}
