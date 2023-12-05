package com.ClassRoom.Arrays.Array2D;

import java.util.Arrays;

public class MaxIn_2DArray {
    public static void main(String[] args){
        int[][] arr={
                {12,54,78},
                {76,89,25,456},
                {100,213,546}
        };
        int result=Max(arr);
        System.out.println("Max value in 2D array:"+result);

    }

    static int Max(int[][] arr){
        int max=Integer.MIN_VALUE;     //-2147483648
        for(int[] ints:arr){
            for(int elements:ints){
                if (elements > max){
                    max=elements;
                }
            }
        }
        return max;
    }

}
