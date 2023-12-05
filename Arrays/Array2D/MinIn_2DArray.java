package com.ClassRoom.Arrays.Array2D;

public class MinIn_2DArray {
    public static void main(String[] args){
        int[][] arr={
                {45,78,96,44},
                {72,36,41,40,98},
                {125,356,412,10}
        };

        int result=Min(arr);
        System.out.println("Min value:"+result);
        System.out.println(Integer.MAX_VALUE);

    }

    static int Min(int[][] arr){
        int min=Integer.MAX_VALUE;     //2147483647
        for(int[] row:arr){
            for(int col:row){
                if(col<min){
                    min=col;
                }
            }
        }
        return min;
    }
}
