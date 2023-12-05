package com.ClassRoom.Arrays.Searching;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2,3};
        int target=6;
        int res=findPivot(nums);
        System.out.println("Result:"+res);


    }

    public static int search(int[] nums,int target){
        int pivot=findPivot(nums);

        //if we did not find the pivot,it means the array is not rotated
        if (pivot== -1){
            //just normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }

        //if pivot is found,we have two asc sorted array
        //case1-->pivot==target
        if (nums[pivot] == target){
            return pivot;
        }

        //case2-->if target>start element
        if (target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }

        //case3-->if target<start element
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    public static int binarySearch(int[] nums,int target,int start,int end){
        while (start < end){
            int mid=start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            }
            else if (target > nums[mid]){
                start=mid+1;
            }
            else
                return mid;
        }
        return -1;
    }

    //This will not work for duplicate values
    public static int findPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while (start <= end){
            int mid=start+(end-start)/2;
            //4 cases
            if ( (mid<end) && (nums[mid]>nums[mid+1])){  //mid<end-->if mid is at the last index
                return mid;
            }
            if ( (mid>start) && (nums[mid]<nums[mid-1])){
                return mid-1;
            }
            if (nums[mid] <= nums[start]){
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] nums){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if ((mid<end) && (nums[mid]>nums[mid+1])){
                return mid;
            }
            if ((end>start) && (nums[mid]<nums[mid-1])){
                return mid-1;
            }

            //if elements at middle,start,end are equal the skip the duplicates
            if (nums[mid]==nums[start] && nums[mid]==nums[end]){
                //skip duplicates
                //Note:what if these elements at start and end were the pivot?
                //check if start is pivot or not
                if (nums[start] > nums[start+1]){
                    return start;
                }
                start++;

                //check if end is pivot or not
                if (nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }

            //left side is sorted so pivot in right
            else if (nums[start] < nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end]){
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return -1;
    }
}
