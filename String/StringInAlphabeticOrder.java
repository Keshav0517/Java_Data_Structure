package com.ClassRoom.String;

import java.util.Arrays;

public class StringInAlphabeticOrder {
    public static void main(String[] args) {
        String str="bcdafe";
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }
}
