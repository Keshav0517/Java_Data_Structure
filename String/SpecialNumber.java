package com.ClassRoom.String;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no:");
        int total = sc.nextInt();                      //User Input
        int n = 10;                                   //Special number start from 10

        while (total > 0) {
            String s = Integer.toString(n);            //Convert n into String
            int len = s.length();                     //length of String n

            if (len % 2 == 0) {                       //if no of digits=4(special no)
                String p1 = s.substring(0, len / 2);
                String p2 = s.substring(len / 2);
                int a=Integer.parseInt(p1);          //String p1 is converted into Integer
                int b=Integer.parseInt(p2);          //String p2 is converted into Integer
                int c=a+b;
                c=c*c;
                int n1=Integer.parseInt(s);         //convert String s into Integer(original)

                if (c==n1){
                    System.out.println("Special Number:"+n);
                    total--;                               //total-->15,14,13,12,11,10.....
                }
            }
            n++;                                          //n-->10,11,12,13....
        }
    }
}
