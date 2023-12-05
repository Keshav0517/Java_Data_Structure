package com.ClassRoom.Arrays.Searching;

public class FloorOfNumber {
    //Floor=Greater number smaller or equal to target
    public static void main(String[] args){
        int[] arr={2,3,9,14,16,18,25,41};
        int target=15;
        int res=floorOfNumber(arr,target);
        System.out.println("Floor value of a given number:"+res);

    }

    public static int floorOfNumber(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target > arr[mid]){
                start=mid+1;
            }
            else if (target < arr[mid]){
                end=mid-1;
            }
            else
                return mid;
        }
        return end;               //Floor value arr[end]:-actual value,end:-index value
    }
}
