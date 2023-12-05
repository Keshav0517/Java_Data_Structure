package com.Array;

public class MissingNumber {
    //link-->https://leetcode.com/problems/missing...
    public int missingNumber(int[] nums,int n){
        int sum=n*(n+1)/2;
        int sumOfElement=0;
        for(int i=0;i<nums.length;i++){
            sumOfElement=sumOfElement+nums[i];
        }
        return (sum-sumOfElement);
    }
    public static void main(String[] args) {
        int[] nums={1,2,4,5,6};
        int n=6;
        MissingNumber obj=new MissingNumber();
        int result=obj.missingNumber(nums,n);
        System.out.println("Missing number:"+result);

    }
}
