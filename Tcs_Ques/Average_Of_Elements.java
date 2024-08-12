package Tcs_Ques;

public class Average_Of_Elements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int result=average(arr,n);
        System.out.println(result);
    }

    public static int average(int[] arr,int n){
        int sum=0;
        int avg;
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return avg=sum/n;
    }
}
