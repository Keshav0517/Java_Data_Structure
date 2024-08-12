package Tcs_Ques;

public class RepeatingElements {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,2,1,4,3};
        int n=arr.length;
        repeatingElement(arr,n);

    }

    public static void repeatingElement(int[] arr,int n){
        int cnt=0;
        int[] dup=new int[n];

        for (int i=0;i<=n-1;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    dup[cnt++]=arr[i];
                }
            }
        }

        for (int i=0;i<n;i++){
            if (dup[i] != dup[i+1]){
                System.out.print(dup[i]+" ");
            }
        }
    }


//    public static void repeating(int[] arr,int n){
//
//        for (int i=0;i<n;i++){
//            int index=arr[i]%n;
//            arr[index]=arr[index]+n;
//        }
//
//        int number=0;
//        for (int i=0;i<n;i++){
//            if ((arr[i]/2)>=2){
//                number=arr[i]/2;
//            }
//        }
//        System.out.print(number+" ");
//
    }

