package com.ClassRoom.Arrays.Array;

import java.util.Arrays;

public class FirstAndSecondMax {
    public static void main(String[] args) {
        int[] arr={11,45,69,65,45,98,98};
        //arr={11,45,45,69,98,98};
        Arrays.sort(arr);
        int max1=arr[arr.length-1];
        System.out.println("Max1:"+max1);

        if (arr[arr.length-1] != arr[arr.length-2]){
            System.out.println("Max2:"+arr[arr.length-2]);
        }
        else{
            int i;
            for (i=0;i<arr.length;i++){
                if (arr[i]==arr[arr.length-1]){
                    break;
                }
            }
            System.out.println("Max2:"+arr[i-1]);
        }
    }
}

