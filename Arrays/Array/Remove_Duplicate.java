package Array.Array2D;

import java.util.Arrays;

//Remove Duplicate From Array using Two Pointers
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1292296123/

public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2,2};
        int j=1;    //first element always unique
        for (int i=0;i<arr.length;i++){
            if (arr[i] != arr[j-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        System.out.println("Unique:"+j);

    }
}
