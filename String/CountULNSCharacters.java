package com.ClassRoom.String;

public class CountULNSCharacters {
    public static void main(String[] args) {
        String str="PrOGram@$1123";
        int upperCase=0,lowerCase=0,number=0,symbol=0;
        char[] ch=str.toCharArray();

        for (int i=0;i<ch.length;i++){
            if ((ch[i]>='A') && (ch[i]<='Z')){
                upperCase++;
            }
            else if ((ch[i]>='a') && (ch[i]<='z')){
                lowerCase++;
            }
            else if ((ch[i]>='0') && (ch[i]<='9')){
                number++;
            }
            else
                symbol++;
        }
        System.out.println("Count of UpperCase:"+upperCase);
        System.out.println("Count of LowerCase:"+lowerCase);
        System.out.println("Count of Number:"+number);
        System.out.println("Count of Symbol:"+symbol);
    }
}
