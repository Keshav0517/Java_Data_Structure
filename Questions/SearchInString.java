package com.ClassRoom;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String s="Kunal";
        char target='n';
        boolean result=searchInString(s,target);
        System.out.println("Result:"+result);

        int result2=searchString(s,target);
        System.out.println("Result2:"+result2);

        boolean res=search(s,target);
        System.out.println("Result3:"+res);

        System.out.println(Arrays.toString(s.toCharArray()));   //[k,u,n,a,l]
    }

    public static boolean searchInString(String s,char target){
        if(s.length()==0){
            return false;
        }

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==target){      //charAt();
                return true;
            }
        }
        return false;
    }

    public static int searchString(String s,char target) {
        if (s.length() == 0) {
            return -1;
        }

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }

    public static boolean search(String s,char target){
        if (s.length()==0){
            return false;
        }

        for (char ch:s.toCharArray()){        //toCharArray();
            if(ch==target){
                return true;
            }
        }
        return false;
    }

}
