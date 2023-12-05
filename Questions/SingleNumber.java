package com.Array;

//Problem statement:-Given a non-empty array of integers nums, every element appears twice except for one.
// Find that single one.

//int[] arr={4,1,2,1,2};
//Ans:- 4
//Approch:-sort an array,use XOR bitwise operator

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums={4,1,2,1,2};
        int result=singleNumber(nums);
        System.out.println("Single Number:"+result);

    }

    static int singleNumber(int[] nums){
        Arrays.sort(nums);
        int xor=0;
        for(int num:nums){
            xor= xor ^ num;
        }

        return xor;
    }
}
