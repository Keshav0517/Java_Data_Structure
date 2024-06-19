package Array.Array2D;

import java.util.Arrays;

//
public class Rearrange_in_asc_desc {
    public static void main(String[] args) {
        int[] arr={8,7,1,6,5,9};
        int n=arr.length;
        sort(arr,n);
        rearrange(arr,n);



    }

    public static void rearrange(int[] arr,int n){
        for (int i=0;i<=(n/2-1);i++){
            System.out.print(arr[i]+" ");
        }
        for (int j=n-1;j>=n/2;j--){
            System.out.print(arr[j]+" ");
        }
    }
    public static void sort(int[] arr,int n){
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
