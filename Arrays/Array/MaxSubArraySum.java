package com.ClassRoom.Arrays.Array;

//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&category[]=Arrays&sortBy=submissions
public class MaxSubArraySum {
    // Kadanes-Algorithm
    public static void main(String[] args) {
        MaxSubArraySum obj=new MaxSubArraySum();
        int[] arr={-1,-2,-3,-4};
        int n=arr.length;
        int res=obj.maxSubArraySum(arr,n);
        System.out.println("Max SubArray Sum:"+res);

    }

    public static int maxSubArraySum(int[] arr,int n){

        int maxSum=arr[0];
        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
            if (sum>maxSum){
                maxSum=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
