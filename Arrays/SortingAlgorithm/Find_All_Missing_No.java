package Arrays.SortingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
public class Find_All_Missing_No {
    public static void main(String[] args) {
        Find_All_Missing_No obj=new Find_All_Missing_No();
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> result=obj.findDisapperedNumber(nums);
        System.out.println(result);
    }

    public List<Integer> findDisapperedNumber(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if (nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }

        //Find missing
        List<Integer> ans=new ArrayList<>();
        for (int index=0;index<nums.length;index++){
            if (nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    public void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
