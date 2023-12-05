package com.ClassRoom.Questions;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no:");
        int n=sc.nextInt();
        String s=n+"";
        int len=s.length();

        int sum=0;
        int temp=n;
        while (n>0){
            int d=n%10;
            sum+=Math.pow(d,len);
            n=n/10;
        }
        if (sum==temp){
            System.out.println("Armstrong Number");
        }
        else
            System.out.println("Not Armstrong Number");
    }
}
