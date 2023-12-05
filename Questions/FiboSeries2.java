package com.ClassRoom.Questions;

import java.util.Scanner;

public class FiboSeries2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int limit=sc.nextInt();
        for(int pos=1;pos<limit;pos++){
            int val=fiboSeries(pos);
            System.out.print(val+" ");
        }
    }

    public static int fiboSeries(int pos){
        if (pos==1 || pos==2){
            return 1;
        }
        else {
            return fiboSeries(pos-1)+fiboSeries(pos-2);
        }
    }

}
