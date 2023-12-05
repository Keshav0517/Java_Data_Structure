package com.ClassRoom.Questions;
import java.util.*;
import java.lang.*;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        int[] res=twoSum(arr,target);
        System.out.println("Two Sum:"+res);
    }

    public static int[] twoSum(int[] arr,int target){
        //Tc-->O(n^2)  Sc-->O(1)
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
               if (arr[j]==target-arr[i]){
                   return new int[] {i,j};
               }
            }
        }
        return null;
    }
}
