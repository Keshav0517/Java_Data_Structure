package com.ClassRoom.Arrays.Array;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class NumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        NumbersAreSmallerThanCurrentNumber obj=new NumbersAreSmallerThanCurrentNumber();
        int[] nums={8,1,2,2,3};
        int[] res=obj.smallerNumbersThanCurrent(nums);
        System.out.println("How many Numbers are smaller than Current number:"+res);

    }

    public static int[] smallerNumbersThanCurrent(int[] nums){
        //Brute Force Approch Tc-->O(n^2) Sc-->O(n)
        int[] temp=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            temp[i]=count;
        }
        return temp;
    }

    public static int[] smallerNumbersThanCurrentNumber(int[] nums){
        //Optimized Approch Tc-->O(n) Sc-->O(n)
        int[] res=new int[nums.length];
        int[] temp=new int[101];

        //store frequency
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]++;
        }

        //running sum
        for(int i=0;i<101;i++){
            temp[i]+=temp[i-1];
        }

        //store ans
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[i]=0;
            }
            else{
                res[i]=temp[nums[i]-1];
            }
        }
        return res;
    }
}
