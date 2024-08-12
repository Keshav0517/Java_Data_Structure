package Tcs_Ques;

public class MajorityElement_I {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,5,2,2,3,5,3,4,3};
        int n=arr.length;
        int result=MajorityElement_I.majority(arr,n);
        System.out.println(result);
    }

    public static int majority(int[] arr,int n){
        int cnt=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[j]==arr[i]){
                    cnt++;
                }
            }
            if (cnt>n/2){
                return arr[i];
            }
        }
        return -1;
    }
}
