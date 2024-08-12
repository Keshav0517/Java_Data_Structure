package Tcs_Ques;

public class Max_Sum_SubArray {
    public static void main(String[] args) {
        int[] arr={-1, 3, -2, 5, 3, -5, 2, 2};
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                max=Math.max(max,sum);
            }
        }
        System.out.println(max);
    }
}
