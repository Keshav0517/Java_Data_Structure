package com.ClassRoom.Arrays.Array;

// https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&sortBy=submissions
public class MinJump {
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n=arr.length;
        int res=minJump(arr,n);
        System.out.println("Min jump:"+res);
    }

    public static int minJump(int[] arr,int n){
        int maxR=arr[0];
        int step=arr[0];
        int jump=1;

        if (n==1){
            return 0;
        }
        else if (arr[0]==0){
            return -1;
        }
        else {
            for (int i=1;i<n;i++){
                if (i==(n-1)){
                    return jump;
                }
                maxR=Math.max(maxR,arr[i]+i);
                step--;
                if (step==0){
                    jump++;
                    if (i >= maxR){
                        return -1;
                    }
                    step=maxR-i;
                }
            }
        }
        return jump;
    }
}
