package Tcs_Ques;

public class Non_Repeating {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,2,1,4};
        int n=arr.length;
        boolean check;
        for (int i=0;i<n;i++){
            check=false;
            for (int j=0;j<n;j++){
                if ( i!=j && arr[i] == arr[j]){
                    check=true;
                    break;
                }
            }
            if (!check){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
