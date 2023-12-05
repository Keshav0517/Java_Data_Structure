package com.ClassRoom.Arrays.ArrayList;

import java.util.ArrayList;

public class DuplicatesValues {
    public static void main(String[] args) {
        int[] arr={0,3,4,5,7};
        int n=arr.length;
        DuplicatesValues obj=new DuplicatesValues();
        ArrayList<Integer> res=obj.duplicates(arr,n);
        System.out.println(res);

    }

    public static ArrayList<Integer> duplicates(int[] arr,int n){
        ArrayList<Integer> duplicates=new ArrayList<>();
        for (int i=0;i<n;i++){
            int index=arr[i]%n;
            arr[index]=arr[index]+n;
        }
        for (int i=0;i<n;i++){
            if (arr[i]/n>=2){
                duplicates.add(i);
            }
        }
        return duplicates;
    }
}
