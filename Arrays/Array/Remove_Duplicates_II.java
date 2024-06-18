package Array.Array2D;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
//Tc-O(n) Sc-O(1)
public class Remove_Duplicates_II {
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
