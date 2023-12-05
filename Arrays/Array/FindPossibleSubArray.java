package com.ClassRoom.Arrays.Array;

public class FindPossibleSubArray {
    public static void main(String[] args) {
        int[] arr={-5,4,6,-3,4,-1};
        for (int i=0;i<arr.length;i++)
            for (int j=i;j<arr.length;j++){
                //print all sub array
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                    System.out.println("");
                }
            }
        }
    }
