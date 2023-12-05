package com.ClassRoom.Arrays.Searching;

// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArray {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int k=2;
        int res=splitArray(nums,k);
        System.out.println("Max Sum:"+res);

    }

    public static int splitArray(int[] nums,int k){
        int start=0;
        int end=0;
        for (int i=0;i<nums.length;i++){
            //In the end of the loop this will contain the max item from the nums[]=10;
            start=Math.max(start,nums[i]);
            end=end+nums[i];               //sum of each element of array 7+2+5+10+8=32
        }
        //binary Search
        while (start <end){
            int mid=start+(end-start)/2;   //mid=42/2 , 21
            //calculate how many pieces
            int sum=0;
            int pieces=1;
            for(int num:nums){             //7,2,5,10,8
                if (sum+num > mid){
                    //cant add this in this subarray,make new one
                    //say you add this sum in new subarray,then sum=num
                    sum=num;
                    pieces++;
                }
                else {
                    sum=sum+num;
                }
            }
            if (pieces > k){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return end;
    }
}
