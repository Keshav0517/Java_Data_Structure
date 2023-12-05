package com.ClassRoom.Arrays.Array;

import java.util.Arrays;

public class DifferenceMaxMin {
    public static void main(String[] args) {
        int[] arr={41,12,35,45,79,68,74};
        int res=differenceMaxMin(arr);
        System.out.println("Difference Between Max-Min:"+res);
        int result=differenceMaxMin2(arr);
        System.out.println("Difference between Max-Min for sorted array:"+result);

    }

    //Sorted array
    public static int differenceMaxMin2(int[] arr){
        Arrays.sort(arr);
        int difference=arr[arr.length-1] - arr[0];
        return difference;
    }

    //unsorted array
    public static int differenceMaxMin(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int diff;
        for (int i=1;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){
                if (arr[i] > max){
                    max=arr[i];
                }
                else if (arr[j] < min ){
                    min=arr[j];
                }

            }
        }
        diff=max-min;
        return diff;
    }
}
