package com.Array;

public class EvenDigits {
    public static void main(String[] args){
        int[] nums={78,2,1,456,7896};
        //System.out.println(digits(78));
        System.out.println(findEven(12456987));

    }

    static int findNumbers(int[] nums){
        int count=0;

        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //method to check weather a number contain Even no of Digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);

        if(numberOfDigits % 2==0){
            return true;
        }
        return false;
    }

    //optimized solution

    static int findEven(int num){

        if(num<0){
            num=num*(-1);
        }

        return (int) (Math.log10(num)+1);
    }

    static int digits(int num){

        if(num<0){
            num=num*(-1);          //for negative number
        }

        if(num==0){
            return 1;              //num itself is 0 return 1
        }

        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }

}
