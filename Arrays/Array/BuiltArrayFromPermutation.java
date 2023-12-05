package com.ClassRoom.Arrays.Array;

// https://leetcode.com/problems/build-array-from-permutation/
public class BuiltArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};             //output->[0,1,2,4,5,3]
        int[] res=builtArray(nums);
        System.out.println(res);

        int[] res2=builtArray2(nums);
        System.out.println(res2);
    }

    public static int[] builtArray(int[] nums){
        //TC-->O(n) , SC-->O(n)
        int[] result=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            result[i]=nums[nums[i]];
        }
        return result;
    }

    public static int[] builtArray2(int[] nums){
        //TC-->O(n), SC-->O(1)
        int n=nums.length;
        for (int i=0;i<n;i++){
            nums[i]=n*(nums[nums[i]]%n)+nums[i];
        }
        for (int i=0;i<n;i++){
            nums[i]=nums[i]/n;
        }
        return new int[] {};
    }
}
