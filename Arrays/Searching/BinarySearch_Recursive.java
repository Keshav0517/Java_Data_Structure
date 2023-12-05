package com.ClassRoom.Arrays.Searching;

public class BinarySearch_Recursive {

     static int binarySearch(int arr[],int low,int high,int key){
        if (high >= low) {
            int mid = (high + low) / 2;


            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid]>key){
                return binarySearch(arr,low,mid-1,key);
            }

            if(arr[mid]<key){
                return binarySearch(arr,mid+1,high,key);
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int low=0;
        int high=arr.length-1;
        int key=30;

        int result=binarySearch(arr,low,high,key);

        System.out.println("Element at index"+" "+result);



    }
}
