package com.ClassRoom.String;

import java.util.Arrays;

public class MaxLenString {
    public static void main(String[] args) {
        String[] s={"ram","rahul","shyam","rohan"};
        int max=0;
        String name="";
        for (int i=0;i<s.length;i++){
            if (max<s[i].length()){
                max=s[i].length();
                name=s[i];
            }
        }
        System.out.println(name);
    }
}
