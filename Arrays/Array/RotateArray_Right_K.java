package Array.Array2D;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/submissions/1292661441/

public class RotateArray_Right_K {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int k=3;
        rotate(arr,k,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr,int k,int n){
        if (k>n){
            k=k%n;
        }
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

    }

    public static void reverse(int[] arr,int start,int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
