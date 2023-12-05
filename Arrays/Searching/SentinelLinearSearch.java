package com.ClassRoom.Arrays.Searching;

public class SentinelLinearSearch {
    //improved version of linear search
    //reduce no of compares
    public static int sentinelLinearSearch(int arr[],int target){
        int last=arr[arr.length-1];
        arr[arr.length-1]=target;
        int i=0;
        while(arr[i] != target){
            i++;
        }
        arr[arr.length-1]=last;
        if(i<arr.length-1 ||last==target){
            return i;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args){
        int[] arr={10,50,48,69,72,35,46};
        int key=69;
        int result=sentinelLinearSearch(arr,key);
        System.out.println("key at index:"+result);

    }
}
