package com.ClassRoom.String;

public class FindTotalVowels {
    public static void main(String[] args) {
        String s="Program";
        s=s.toLowerCase();
        int cnt=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           switch (ch){
               case 'a':
               case 'e':
               case 'i':
               case 'o':
               case 'u':cnt++;
           }
        }
        System.out.println("Total number of vowels:"+cnt);
    }
}
