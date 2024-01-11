package Arrays.SortingAlgorithm;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/submissions/1143645928/
public class MissingNo_UsingCycleSort {
    public static void main(String[] args) {
        int[] nums={4,8,2,1,3,7,5,6,9};                  //if 0 is not present in array result is-0
        int result=missingNo(nums);
        System.out.println("Result:"+result);
    }

    public static int missingNo(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i];           //array element from 0-n or index is start from 0-nums.length
            if((nums[i]<nums.length)&& (nums[i]!=nums[correctIndex])){
                swap(nums,i,correctIndex);
            }
            else
                i++;
        }

        //Missing No
        for (i=0;i<nums.length;i++){
            if (nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
