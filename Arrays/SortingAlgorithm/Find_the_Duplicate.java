package Arrays.SortingAlgorithm;

//    https://leetcode.com/problems/find-the-duplicate-number/description/

import java.util.Arrays;

public class Find_the_Duplicate {
    public static void main(String[] args) {
        int[] nums={3,1,3,4,2};
        Find_the_Duplicate obj=new Find_the_Duplicate();
        int result=obj.findDuplicate(nums);
        System.out.println(result);
    }

    public int findDuplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            if (nums[i]!=i+1){
                int correctIndex=nums[i]-1;
                if(nums[i]!=nums[correctIndex]){
                    swap(nums,i,correctIndex);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    public void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=nums[first];
    }
}
