package Tcs_Ques;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
public class Remove_Duplicates_II {
    //Tc-O(n) Sc-O(1)
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,3,3};
        int j=2;
        for (int i=2;i<arr.length;i++){
            if (arr[i] != arr[j-2]){
                arr[j]=arr[i];
                j++;
            }
        }
        System.out.println("Unique elements:"+j);
    }
}
