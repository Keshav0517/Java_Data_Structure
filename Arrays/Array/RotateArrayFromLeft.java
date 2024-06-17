package Array.Array2D;

import java.util.Arrays;

public class RotateArrayFromLeft {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int d=2;

        RotateArrayFromLeft.rotate(arr,n,d);
    }

    public static int rotate(int[] arr,int n,int d){
        d=d%n;
        int[] temp=new int[n];

        //store element from d to n-1 into temp array
        int k=0;
        for (int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
        }

        //store first two element into temp array
        for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }

        //copy all temp element into original array
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }

        System.out.println(Arrays.toString(arr));

        return -1;
    }
}
