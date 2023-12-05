package com.ClassRoom.Oops;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row:");
        int r=sc.nextInt();
        for (int i=0;i<r;i++){
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

/*
Output:-
 *
 * *
 * * *
 * * * *
 * * * * *

 */