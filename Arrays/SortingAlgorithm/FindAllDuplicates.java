import java.util.*;
import java.lang.*;


public class FindAllDuplicates {
    public static void main(String[] args) {
        FindAllDuplicates obj=new FindAllDuplicates();
        int[] arr={4,5,8,9,2,1,4,2};
        List<Integer> result=obj.findDuplicates(arr);
        System.out.println(result);
    }
    public List<Integer> findDuplicates(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }


        List<Integer> ans=new ArrayList<>();
        for (int index=0;index<arr.length;index++){
            if (arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
