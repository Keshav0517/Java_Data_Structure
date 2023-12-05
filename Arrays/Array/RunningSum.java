package com.ClassRoom.Arrays.Array;

// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] res=runningSum(nums);
        System.out.println(res);
    }

    public static int[] runningSum(int[] nums){
        int n=nums.length;
        for (int i=1;i<n;i++){
            nums[i]=nums[i]+nums[i-1];                 //nums={1,3,6,10}
        }
        return nums;
    }
}
