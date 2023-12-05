package com.ClassRoom.Oops;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row:");
        int r=sc.nextInt();
        System.out.print("Enter col:");
        int c=sc.nextInt();
        for (int i=0;i<r;i++){
            for (int k=0;k<c;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
