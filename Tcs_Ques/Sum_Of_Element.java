package Tcs_Ques;

public class Sum_Of_Element {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int result=sumOfElements(arr,n);
        System.out.println("Sum of Array Elements:"+result);

    }


    public static int sumOfElements(int[] arr,int n){
        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
