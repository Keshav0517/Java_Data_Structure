package com.ClassRoom.Questions;

public class FindFactorsOfNumber {
    public static void main(String[] args) {
        int num=100;
        int i=1;
        while (i<=100){
            if (num%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
