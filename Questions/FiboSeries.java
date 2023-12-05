package com.ClassRoom.Questions;

import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit=sc.nextInt();
        int f1=1,f2=1,f3=f1+f2;
        System.out.print(f1+" "+f2);
        for (int pos=3;pos<limit;pos++){
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;
            f3=f1+f2;          // 1 1 2 3 5 8
            //f3=f1*f2;           // 1 1 2 2 4 8 32

        }
    }
}
