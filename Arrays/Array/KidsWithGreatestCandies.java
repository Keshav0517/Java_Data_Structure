package com.ClassRoom.Arrays.Array;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        KidsWithGreatestCandies obj=new KidsWithGreatestCandies();
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        ArrayList<Boolean> res=obj.kidsWithCandies(candies,extraCandies);
        System.out.println("Brute Force:"+res);

        ArrayList<Boolean> res1= obj.kidsWithCandies1(candies,extraCandies);
        System.out.println("Optimized:"+res1);
    }

    public ArrayList<Boolean> kidsWithCandies(int[] candies,int extraCandies){
        //Brute Force Approch TC-->O(n^2) SC-->O(n)
        ArrayList<Boolean> ans=new ArrayList<>();
        for (int i=0;i<candies.length;i++){
            boolean test=false;
            for (int j=0;j<candies.length;j++){
                if (candies[i]+extraCandies < candies[j]){
                    test=true;
                    break;
                }
            }
            if (test){                //if 'test' is true
                ans.add(false);
            }
            else
                ans.add(true);
        }
        return ans;
    }

    //Optimized Approch TC-->O(N) SC-->O(N)
    public ArrayList<Boolean> kidsWithCandies1(int[] candies,int extraCandies){
        ArrayList<Boolean> ans1=new ArrayList<>(candies.length);
        int max=Integer.MIN_VALUE;
        for (int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for (int i:candies){
            ans1.add(i>=(max-extraCandies));
        }
        return ans1;
    }
}
