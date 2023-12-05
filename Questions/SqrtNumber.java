package com.Array;

import java.util.Scanner;

public class SqrtNumber {
    // https://leetcode.com/problems/sqrtx/description/
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Value:");
        int x=in.nextInt();
        int result=sqrtNumber(x);
        System.out.println("Result:"+result);
    }

    public static int sqrtNumber(int x){
        long start=1;
        long end=x;
        long ans=0;
        while (start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==x){
                ans=(int)mid;
                break;
            }
            else if(mid*mid<x){
                start=mid+1;
                ans=mid;
            }
            else {
                end=mid-1;
            }
        }
        return (int)ans;
    }
}
