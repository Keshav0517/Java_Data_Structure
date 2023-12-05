package com.ClassRoom.Arrays.Searching;

public class FirstAndLastPosition {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {
        int[] nums={2,3,7,7,7,7,8,8,9,10};
        int target=7;
        int[] res=searchRange(nums,target);
        System.out.println("Result:"+res);
    }

    public static int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};
        //Check for first occurrence if target first
        int start=search(nums,target,true);
        int end=search(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    public static int search(int[] nums,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            }
            else if (target>nums[mid]){
                start=mid+1;
            }
            else {
                //potential ans
                ans=mid;
                if (findStartIndex){
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
        }
        return ans;
    }
}
