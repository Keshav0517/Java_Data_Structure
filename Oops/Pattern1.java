package com.ClassRoom.Oops;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num:");
        int n=sc.nextInt();
        for (int r=0;r<n;r++){
            for (int val=n;val>=1;val--){
                for (int freq=1;freq<n-r;freq++){
                    System.out.print(val);
                }
            }
            System.out.print("\n");
        }

    }
}
