package Tcs_Ques;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_HashMap {
    public static void main(String[] args) {
        int[] arr={2,2,3,5,2,1,2};
        int n=arr.length;
        int result=majority(arr,n);
        System.out.println("Majority element:"+result);
    }

    public static int majority(int[] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            if (map.containsKey(arr[i])){
                int count=map.get(arr[i]);
                map.put(arr[i],count+1);
            }
            else {
                map.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
