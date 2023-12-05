package com.ClassRoom.Arrays.Array;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5,5,7};
        int s=12;
        int n=arr.length;
        subArrayWithGivenSum(arr,n,s);

    }

    public static void subArrayWithGivenSum(int[] arr,int n,int s) {
        //TC-->O(n^2) SC-->O(1)
        //Return no of sub array which sum is = given sum

        for (int i=0;i<n;i++){
            int currentSum=arr[i];
            for (int j=i+1;j<n;j++){
                currentSum=currentSum+arr[j];
                if (currentSum==s){
                    System.out.println((i+1)+" "+(j+1));  //1 based indexing
                    break;
                }
                else if (currentSum >s){
                    currentSum=currentSum-arr[i];
                }
            }
        }
    }
}
