package com.ClassRoom.Arrays.Searching;

// https://leetcode.com/problems/find-peak-element/description/
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int res=peakIndexInMountainArray(arr);
        System.out.println("Result:"+res);

    }

    public static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start < end){
            int mid=start+(end-start)/2;
            if (arr[mid] > arr[mid+1]){
                end=mid;
            }
            else
                start=mid+1;
        }
        return start;
    }
}
