package com.ClassRoom.Arrays.Array;

// https://leetcode.com/problems/concatenation-of-array/
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int[] res=concatenationOfArray(nums);
        System.out.print("Array:"+res);
    }

    public static int[] concatenationOfArray(int[] nums){
        int n=nums.length;
        int[] ans=new int[2*n];
        for (int i=0;i<n;i++){
            ans[i]=nums[i];                  // ans={1,2,1}
            ans[i+n]=nums[i];                //ans={1,2,1,1,2,1}
        }
        return ans;
    }
}
