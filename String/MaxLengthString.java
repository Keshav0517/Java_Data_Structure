package com.ClassRoom.String;

import java.util.Arrays;
import java.lang.String;
import java.util.Comparator;
import java.util.Locale;

public class MaxLengthString {
    public static void main(String[] args) {
        String[] str = {"Ram", "Shyam", "Ab", "MKLML", "Tejas"};
        findMaxString(str);

    }

    public static void findMaxString(String[] str) {
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            if (max < str[i].length()) {
                max = str[i].length();
            }
        }
        for (int i=1;i<str.length;i++){
            if (str[i].length()==max){
                System.out.println(str[i]);
            }
        }

    }

}
