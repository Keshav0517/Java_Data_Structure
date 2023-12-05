package com.ClassRoom.Arrays.Searching;

public class BinarySearch {
    //Time Complexity:-O(log(n)),space:-O(1)
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90};
        int target=40;
        int res=binarySearch(arr,target);
        System.out.println("Result:"+res);
    }

    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start <= end){
            int mid=start+(end-start)/2;
            if (target > arr[mid]){
                start=mid+1;
            }
            else if(target < arr[mid]){
                end=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
}
