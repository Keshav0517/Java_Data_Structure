package Tcs_Ques;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Count_HashMap {
    public static void main(String[] args) {
        int[] arr={10,5,15,10,5,6,10};
        int n=arr.length;
        Frequency_Count_HashMap.frequency(arr,n);
    }

    public static void frequency(int[] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        //Traverse HashMap
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
