package com.ClassRoom.Arrays.Searching;

public class OrderAgnosticBS {
    //Find weather the array is sorted in ascending or descending
    public static void main(String[] args) {
        int[] arr = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        int target = 70;
        int res=orderAgnosticBS(arr,target);
        System.out.println("Result:"+res);
    }

    public static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //Find weather the array is sorted in ascending or descending
        boolean isAsc=arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;

            //Common condition
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
