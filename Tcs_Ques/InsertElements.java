package Tcs_Ques;

public class InsertElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        addBeginning(arr,n,0);

    }

    public static void addBeginning(int[] arr,int n,int key){
        for (int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=key;

    }

    public static void addEnding(int[] arr,int n,int key){
        arr[n]=key;
    }

    public static void addAtPosition(int[] arr,int n,int key,int pos){
        for (int i=n-1;i>0;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=key;
    }
}
