package com.ClassRoom.Arrays.Array;


import java.util.Arrays;

public class MergedTwoSorted_Array {
    public static void main(String[] args) {
        MergedTwoSorted_Array obj=new MergedTwoSorted_Array();

        int[] nums1={0,1,5,6};
        int m=nums1.length;

        int[] nums2={7,9,12,15,18};
        int n=nums2.length;

        obj.printArray(nums1);
        obj.printArray(nums2);

        int[] result=obj.mergeArray(nums1,m,nums2,n);
        obj.printArray(result);

    }

    public void printArray(int[] arr){
        int length=arr.length;
        for (int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public int[] mergeArray(int[] nums1,int m,int[] nums2,int n){

        int temp[] =new int[m+n];
        int i=0;   //traverse nums1
        int j=0;   //traverse nums2
        int k=0;   //traverse temp[]

        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                temp[k]=nums1[i];
                i++;
            }
            else{
                temp[k]=nums2[j];
                j++;
            }
            k++;
        }
        while (i < m){
            temp[k]=nums1[i];
            i++;
            k++;
        }

        while (j < n){
            temp[k]=nums2[j];
            j++;
            k++;
        }
        return temp;
    }

}
