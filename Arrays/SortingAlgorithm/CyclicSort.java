package Arrays.SortingAlgorithm;

import java.util.Arrays;

//Tc-->O(n)
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleSort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctIndex=arr[i]-1;                //find correct index to put values
            if (arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);            //swap if element is not present at their correct index
            }
            else {
                i++;            //move forward
            }
        }
    }

    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
