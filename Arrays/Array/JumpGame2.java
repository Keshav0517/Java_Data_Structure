package com.ClassRoom.Arrays.Array;

// https://leetcode.com/problems/jump-game-ii/description/

public class JumpGame2 {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        int[] arr={1,3,5,8,9,2,6,7,6,8,9};
        int res=jumpGame(nums);
        System.out.println("Minimum jump:"+res);

    }

    public static int jumpGame(int[] nums){
        int jump=0;
        int pos=0;
        int des=0;
        for(int i=0;i<nums.length-1;i++){
            des=Math.max(des,nums[i]+i);
            if (pos==i){
                pos=des;
                jump++;
            }
        }
        return jump;
    }
}
