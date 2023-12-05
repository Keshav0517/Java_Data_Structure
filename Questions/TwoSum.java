package com.ClassRoom.Questions;

import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15,16};
        int target=9;

        TwoSum obj=new TwoSum();
        int[] result=obj.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums,int target){
        //TC-->O(n)  SC-->O(n)

        HashMap<Integer,Integer> map= new HashMap();

        //put array elements into hashmap with [elements,index]

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        //search
        for(int i=0;i<nums.length;i++){ //2,7,11,15,16
            int num=nums[i];    //2
            int rem=target-num; //7     or  2 then continue 

            if(map.containsKey(rem)){
                int index=map.get(rem);  //index of rem

                if(index==i) continue;  //continue if rem is same as num

                return new int[] {i,index};
            }
        }
        return new int[] {};
    }
}
