package Tcs_Ques;

import java.util.HashSet;
import java.util.Set;

public class Replace_Element_By_Rank {
    public static void main(String[] args) {
        int[] arr={20,15,26,2,98,6};
        int n=arr.length;


        for (int i=0;i<n;i++){
            Set<Integer> s=new HashSet<>();
            for (int j=0;j<n;j++){
                if (arr[i]>arr[j]){
                    s.add(arr[j]);
                }
            }
            int rank=s.size()+1;
            System.out.print(rank+" ");
        }
    }
}
