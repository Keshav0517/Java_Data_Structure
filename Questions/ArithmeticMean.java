package com.ClassRoom.Questions;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[50];
        float arithmeticMean;
        int sum=0;

        System.out.println("Enter the Size of an array:");
        int n=sc.nextInt();

        System.out.println("Enter the Elements in Array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();

        System.out.println("Display an array elements:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
        }

        System.out.println();

        arithmeticMean=sum/n;
        System.out.println("Arithmetic Mean:"+arithmeticMean);



    }
}
