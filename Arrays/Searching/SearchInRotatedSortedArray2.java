package com.ClassRoom.Arrays.Searching;

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums={2,5,6,0,0,1,2};
        int target=0;
        boolean res=search(nums,target);
        System.out.println("Result:"+res);

    }
    public static boolean search(int[] nums,int target){
        int start=0;
        int end=nums.length-1;

        while (start <= end){
            if (nums[start]==target || nums[end]==target){
                return true;
            }
            else if (target > nums[start]){
                while ( start <end && nums[start+1]==nums[start] ){
                    start++;
                }
                start++;
            }
            else if (target < nums[end]){
                while ( start<end && nums[end-1]==nums[end] ){
                    end--;
                }
                end--;
            }
            else
                break;
        }
        return false;
    }
}
