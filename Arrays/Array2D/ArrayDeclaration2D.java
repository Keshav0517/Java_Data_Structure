package com.ClassRoom.Arrays.Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeclaration2D {
    public static void main(String[] args) {

        //Two Dimensional array
        int[][] a;
        int[] []a1;
        int[] a2[];
        int a3[][];
        int a4[]  [];
        int []a5,b5;
        int[][] a6,b6[];
        int[] a7[],b7[];
        //int[][] a8,[]b8; ce:<identifier> expected

        System.out.println("");


        int[][] arr3=new int[2][];
        arr3[0]=new int[1];
        arr3[1]=new int[2];


        int[][] arr2={
                {1,2,3}, //0th index
                {4,5,6}, //1st index
                {8,9} //2nd index
        };

        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array elements:");
        //arr1.length--no of rows
        //arr1[row].length--To find no of col (if the array of col don't fixed)
        int[][] arr1=new int[3][2];       //Size of no of rows is necessary
        for (int row=0;row< arr1.length;row++){
            for (int col=0;col<arr1[row].length;col++){
                arr1[row][col]=sc.nextInt();
            }
        }

        // System.out.println(Arrays.toString(arr1));   //it give their hashcode

        //Display elements by using for loop
        System.out.println("Display elements by using for loop:");
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+",");
            }
            System.out.println();
        }

        System.out.println("");

        //Display Elements by using toString()
        System.out.println("Display Elements using toString():");
        for (int r=0;r< arr1.length;r++){
            System.out.println(Arrays.toString(arr1[r]));
        }

        System.out.println();

        //Display elements by using Enhance for loop
        System.out.println("Display elements by using Enhance for loop:");
        for (int[] num:arr1){
            System.out.println(Arrays.toString(num));
        }




    }
}
