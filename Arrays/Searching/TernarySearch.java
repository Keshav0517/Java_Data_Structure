package com.ClassRoom.Arrays.Searching;

public class TernarySearch {
    static int ternarySearch(int[] arr,int key,int l,int r){
        while (r >= l){
            //Find mid1 and mid2
            int mid1=l+(r-l)/3;
            int mid2=r-(r-l)/3;

            if(arr[mid1]==key){
                return mid1;
            }

            if(arr[mid2]==key){
                return mid2;
            }

            if(key<arr[mid1]){
                //The key lies in between l and mid1
                r=mid1-1;
            }

            if (key>arr[mid2]){
                //The key lies in between mid2 and r
                l=mid2+1;
            }

            else {
                //The key lies in between mid1 and mid2
                l=mid1+1;
                r=mid2-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int l,r,result,key;
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        l=0;
        r=arr.length-1;
        key=5;
        result=ternarySearch(arr,key,l,r);
        System.out.println("Key value 5 at position:"+result);

        key=7;
        result=ternarySearch(arr,key,l,r);
        System.out.println("key value 7 at index:"+result);
    }
}


//time Complexity: O(log3n), where n is the size of the array.
//ternary =similar as a binary search but binary search divides the array into two parts where
//ternary search divides array into three parts

