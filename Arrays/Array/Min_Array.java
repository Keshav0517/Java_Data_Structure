package com.ClassRoom.Arrays.Array;

public class Min_Array {
    public static void main(String[] args) {
        int[] arr={12,20,56,87,95,63,14};
        int result=minArray(arr);
        System.out.println("Result:"+result);

    }

    public static int minArray(int[] arr){
        int ans=arr[0];
        if (arr.length==0){
            return -1;
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]< ans){
               ans=arr[i];
            }

        }
        return ans;
    }
}
