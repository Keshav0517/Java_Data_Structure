package com.ClassRoom.Arrays.Array;

public class EvenDigits {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    public static void main(String[] args) {
       int[] nums={12,345,2,6,7896,-14};
       int result=findNumber(nums);
        System.out.println("Even Digits:"+result);
    }

    //Count the number of digits in particular element of array
    public static int numberOfDigits(int num){
        if(num <0){
            num=num * -1;     //convert negative number into positive
        }

        if (num==0){
            return 1;
        }

        int count=0;
        while (num >0){
            count++;
            num=num/10;
        }
        return count;
    }

    //Check the num(count) is even or odd
    public static boolean even(int num){
        int evenNumberOfDigits=numberOfDigits(num);
        if (evenNumberOfDigits%2==0){
            return true;
        }
        return false;
    }

    //Find how many even numbers are present in array
    public static int findNumber(int[] nums){
        int count=0;
        for (int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

}
