package com.ClassRoom.Questions;


//Three approch to find Majority element
//1] nlogn--> (n/2)th position element is major element
//2] hash map--> store frequency/occurances of element return element
//3] Moore's voting algorithm is used to find majority element in array(more optimized approch)

//problem statement-->The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.

//link-->https://leetcode.com/problems/majority-element/description/

public class MajorityElement {
    public static void main(String[] args){
        int[] nums={3,1,5,3,3};

        int ans=majorityElement(nums);
        System.out.println("Majority Element:"+ans);
    }

    //Moore's voting algorithm
    static int majorityElement(int[] nums){
        int majority=nums[0];
        int count=1;

        for(int i=1;i<nums.length;i++){

            int num=nums[i];
            if(majority==num){
                count++;
            }

            else{
                count--;
            }

            if(count==0){
                majority=num;
                count=1;
            }
        }

        return majority;
    }
}
