package com.ClassRoom.Questions;
//https://leetcode.com/problems/richest-customer-wealth/

import java.util.Arrays;

public class MaxWealth {
    //Richest customer wealth

    public static void main(String[] args){
        int arr[][]={
                {7,4,9},
                {4,6,2},
                {8,2,5}
        };

        int result=maxWealth(arr);
        System.out.println("Max Wealthy person:"+result);


    }

    static int maxWealth(int[][] arr){
        int max=Integer.MIN_VALUE;

        for(int row=0;row<arr.length;row++){
            int sum=0;

            for(int col=0;col<arr[row].length;col++){
                sum=sum+arr[row][col];
            }

            if(sum>max){
                max=sum;
            }

        }

        return max;

    }
}
