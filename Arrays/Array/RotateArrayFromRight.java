package com.ClassRoom.Arrays.Array;

public class RotateArrayFromRight {
    //TC:O(n),SC:O(1)
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        rightRotate(arr,n,k);

    }

    public static void rightRotate(int[] arr,int n,int k){
        for (int i=0;i<n;i++){
            k=k%n;       //Reduce the number of rotation
            if (i<k){
                System.out.print(arr[n+i-k]+" ");
            }
            else
                System.out.print(arr[i-k]+" ");
        }
    }
}
