package Arrays.SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the loop n-1 times
        for (int i=0;i<arr.length;i++){
            swapped=false;
            //for each step,max element comes at the last index
            for (int j=1;j<arr.length-i;j++){
                //compare if next element < previous element
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }

            //if array is already sorted then swapping is not required,that's why above condition is required
            if (!swapped){
                break;
            }
        }
    }
}
