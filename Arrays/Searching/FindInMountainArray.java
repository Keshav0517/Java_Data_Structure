package com.ClassRoom.Arrays.Searching;

// https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,1};
        int target = 3;
        int res=search(array,target);
        System.out.println("Result:"+res);
    }

    public static int search(int[] arr,int target){
        int peak=peakIndexInMountain(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        if (firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBS(arr,target,peak+1,arr.length);
    }

    public static int peakIndexInMountain(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }
            else
                start=mid+1;
        }
        return start;
    }

    public static int orderAgnosticBS(int[] arr,int target,int start,int end){
        boolean isASC=arr[start] < arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;

            //common condition
            if (arr[mid]==target){
                return mid;
            }

            if (isASC){
                if (target <arr[mid]){
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
            else{
                if (target>arr[mid]){
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
        }
        return -1;
    }
}
