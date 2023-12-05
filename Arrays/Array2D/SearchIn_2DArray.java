package com.ClassRoom.Arrays.Array2D;

import java.util.Arrays;

public class SearchIn_2DArray {

    public static void main(String [] args){
        int [][] array2D={
                {12,48,96,36},
                {45,78,25},
                {75,55,89,10}
        };

        int target=78;
        int[] result=Search(array2D,target);
        System.out.println(Arrays.toString(result));

    }

    static int[] Search(int[][] arr,int target){

        for (int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
