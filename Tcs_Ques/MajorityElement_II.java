package Tcs_Ques;

public class MajorityElement_II {
    public static void main(String[] args) {
        int[] arr={3,2,3,3,2,2,2,3};
        int n=arr.length;
        int result=majority(arr,n);
        System.out.println("Majority element:"+result);
    }

    public static int majority(int[] arr,int n){
        int majority=arr[0];
        int count=1;
        for (int i=0;i<n;i++){
            int num=arr[i];
            if (majority==num){
                count++;
            }else {
                count--;
            }

            if (count==0){
                majority=num;
                count=1;
            }
        }
        
        return majority;
    }
}
