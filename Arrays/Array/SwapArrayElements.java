package com.ClassRoom.Arrays.Array;

import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,8,9};
        swapArray(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }

    public static void swapArray(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
