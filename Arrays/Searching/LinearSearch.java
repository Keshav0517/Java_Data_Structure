package com.ClassRoom.Arrays.Searching;

import java.util.Scanner;
import java.util.SortedMap;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements in an array:");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();

        System.out.print("Enter the target value:");
        int target=sc.nextInt();


        int result=linearSearch(arr,target);
        System.out.println("Result="+result);

        System.out.println("Enter the target2:");
        int target2=sc.nextInt();

        boolean result2=linearSearch2(arr,target2);
        System.out.println("Result="+result2);
    }

    public static int linearSearch(int[] arr, int target){

        if (arr.length==0){
            return -1;
        }

        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearch2(int[] arr,int target2){
        if (arr.length==0){
            return false;
        }
        for (int element:arr){
            if(element==target2){
                return true;
            }
        }
        return false;
    }

}
