package Array.Array2D;

import java.util.Arrays;

public class Rotate_AF_Left_OneByOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int d=2;

        Rotate_AF_Left_OneByOne.rotate(arr,n,d);
    }

    public static int rotate(int[] arr,int n,int d){
        int p=1;
        while(p<=d){
            int last=arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=last;
            p++;
        }
        System.out.println(Arrays.toString(arr));
        return -1;
    }
}
