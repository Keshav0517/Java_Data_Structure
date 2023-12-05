package com.ClassRoom.String;

import java.util.*;
public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str="javatutorial";
        char[] ch=str.toCharArray();
        int len=ch.length;


    }
    public static void duplicateCharacter(int[] ch,int len){
        int index=0;
        for (int i=0;i<ch.length;i++){
            int j;
            for (j=0;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    break;
                }
            }

            if (i==j){
                ch[index++]=ch[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(ch,index)));
    }
}
