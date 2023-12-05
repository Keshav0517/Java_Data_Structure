package com.ClassRoom.Arrays.Searching;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums={4,5,4,7,8,0,1,2};
        int res=countRotation(nums);
        System.out.println("Rotation count:"+res);

    }

    public static int countRotation(int[] nums){
        int pivot=findPivot(nums);
        return pivot+1;              //pivot+1-->total rotation
    }

    //if the duplicates values are not in array
    public static int findPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if ( (mid<end) && nums[mid]>nums[mid+1]){
                return mid;
            }
            if ( (mid>start) && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if (nums[mid]<=nums[start]){
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;
    }

    //if duplicate values are present in array
    public static int findPivotWithDuplicate(int[] nums){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if ( (mid<end) && nums[mid]>nums[mid+1]){
                return mid;
            }
            if ( (mid >start) && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if (nums[mid]==nums[start] && nums[mid]==nums[end]){
                //skip the duplicates
                //check start is pivot or not
                if (nums[start] > nums[start+1]){
                    return start;
                }
                start++;

                //check end is pivot or not
                if (nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }
            else if (nums[start]<nums[mid] || nums[start]==nums[mid] && nums[end]<nums[mid]){
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return -1;
    }
}
