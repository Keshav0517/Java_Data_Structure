package com.ClassRoom.Arrays.Array;

import java.util.Arrays;

public class MaxInReverseOrder {
    public static void main(String[] args) {
        int[] a={12,24,91,63};
        int n=a.length;
        int arr[]=new int[n];
        String res=maxInReverseOrder(a,n);
        System.out.println((res));

    }

    public static String maxInReverseOrder(int[] a,int n){
        int[] arr=new int[n];
        int max=arr[0];
        for (int i=0;i<a.length;i++){
            int rem=a[i]%10;
            int div=a[i]/10;
            rem=rem*10+div;
            arr[i]=rem;
        }
        System.out.println(Arrays.toString(arr));

        for (int i=1;i<arr.length;i++){
            if (arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println("Max Value:"+max);

        int reverse=max%10;
        int divide=max/10;
        int r=reverse*10+divide;
        //System.out.println("Max Reverse:"+r);

        return "Max Value:"+r;
    }

}
