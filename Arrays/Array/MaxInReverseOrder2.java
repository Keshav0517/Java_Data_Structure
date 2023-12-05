package com.ClassRoom.Arrays.Array;

public class MaxInReverseOrder2 {
    //arr={41,52,36,89,78,14,65}
    //Op-->98

    public static void main(String[] args) {
        int[] arr={14,25,63,98,78,41,56};
        int max=0,rev=0;
        for (int i=0;i<arr.length;i++){
            int n=arr[i];
            int revVar=0;
            while(n>0){
                int rem=n%10;
                revVar=(revVar*10)+rem;
                n=n/10;
            }
            if (revVar > rev){
                rev=revVar;
                max=arr[i];

            }
        }
        System.out.println("Max:"+max);

    }
}
