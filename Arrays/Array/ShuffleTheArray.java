package com.ClassRoom.Arrays.Array;

// https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
    }

    public static int[] shuffleArray(int[] nums,int n){
        //Brute Force Approch TC-->O(n) SC-->O(n)
        int[] ans=new int[2*n];
        int j=0;
        for (int i=0;i<2*n;i=i+2){
            ans[i]=nums[j];
            ans[i+1]=nums[j+n];
            j++;
        }
        return ans;
    }

    public static int[] shuffle(int[] nums,int n){      //nums={2,5,1,3,4,7}   n=3
       //Optimized Approch Tc-O(n) Sc-O(1)
        for (int i=0;i<n;i++){
            nums[i+n]=nums[i+n]+nums[i]*1000;          //nums={2,5,1,2003,5004,1007}
        }
        for (int i=0;i<n;i++){                        //  i-0    ,i-1      ,i-2
            nums[2*i]=nums[i+n]/1000;                 //nums[0]-2,nums[2]-5,nums[4]-1
            nums[2*i+1]=nums[i+n]%1000;              //nums[1]-3,nums[3]-4,nums[5]-7
        }
        return nums;                                //[2,3,5,4,1,7]
    }


}
