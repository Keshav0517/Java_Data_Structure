package com.ClassRoom.Arrays.Searching;

public class LinearSearch_Recursive {

    //Linear Search Recursive Approch

    static int linearSearch(int arr[],int size,int key){
        if (size==0){
            return -1;
        }

        else if (arr[size-1]==key){
            return size-1;
        }

        else {
            return linearSearch(arr,size-1,key);
        }
    }

    public static void main(String[] args){

        int arr[]={10,50,70,90,40,50,30,14,20,145,65};
        int key=40;
        int index=linearSearch(arr,arr.length,key);

        if (index != -1){
            System.out.println("Element"+" "+key+" " + "is found at position"+" "+index);
        }

        else {
            System.out.println("Element not found");
        }
    }
}
