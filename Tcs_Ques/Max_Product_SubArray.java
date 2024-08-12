package Tcs_Ques;

public class Max_Product_SubArray {
    public static void main(String[] args) {
        int[] arr={6, -3, -10, 0, 2};
        int n=arr.length;

        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int product=1;
                for (int k=i;k<=j;k++){
                    product=product*arr[k];
                    max=Math.max(max,product);
                }
            }
        }
        System.out.println("Max:"+max);
    }

}
