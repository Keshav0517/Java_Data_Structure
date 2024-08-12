package Tcs_Ques;


//Frequency count of each element in array
public class Frequency_Count {
    public static void main(String[] args) {
        int[] arr={10,5,10,15,10,5};
        int n=arr.length;
        frequency(arr,n);
    }

    //Two loop
    public static void frequency(int[] arr,int n){

        boolean[] visited=new boolean[n];

        //skip visited index
        for (int i=0;i<n;i++){
            if (visited[i]==true){
                continue;
            }

            //frequency
            int count=1;
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" : "+count);
        }
    }
}
