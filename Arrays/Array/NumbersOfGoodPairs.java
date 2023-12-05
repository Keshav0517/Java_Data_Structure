package com.ClassRoom.Arrays.Array;

// https://leetcode.com/problems/number-of-good-pairs/
public class NumbersOfGoodPairs {
    public static void main(String[] args) {
        NumbersOfGoodPairs obj=new NumbersOfGoodPairs();
        int[] nums={1,2,3,1,1,3};
        int res=obj.numIdenticalPair(nums);
        System.out.println("Number of Identical/Good Pairs:"+res);

        int res1=obj.numsIdenticalPair1(nums);
        System.out.println("Optimized Approch:"+res1);
    }

    public int numIdenticalPair(int[] nums){
        //Brute Force Approch TC-->O(n^2),SC-->O(1)
        int pairs=0;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    pairs++;
                }
            }
        }
        return pairs;
    }

    public int numsIdenticalPair1(int[] nums){
        //Optimized Approch TC-->O(n), SC-->O(n)
        int[] temp=new int[101];
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res+temp[nums[i]];
            temp[nums[i]]++;
        }
        return res;
    }
}
