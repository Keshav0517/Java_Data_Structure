package Tcs_Ques;

public class Sum_Even_Index_Element {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (i%2==0){
                sum=arr[i]+sum;
            }
        }
        System.out.println("Sum of Even Index Values:"+sum);
    }
}
