package com.ClassRoom.String;

import java.util.Locale;

public class MethodsOfString {
    public static void main(String[] args) {
        String str="JAVA";

        //char charAt(int index)
        char ch=str.charAt(2);
        System.out.println("Char at index 2:"+ch);

        //int length();
        int len=str.length();
        System.out.println("Length of String:"+len);

        //String toUpperCase(),String toLowerCase()
        System.out.println("UpperCase:"+str.toUpperCase());
        System.out.println("LowerCase:"+str.toLowerCase());


       //boolean equals(),boolean equalsIgnoreCase()
        String a="abc";
        String b="abc";
        String c="Abc";

        boolean a1=a.equals(b);
        System.out.println("Check two Strings are Equal according their case:"+a1);

        boolean a2=a.equals(c);
        System.out.println("Check two strings:"+a2);

        boolean b1=b.equalsIgnoreCase(c);
        System.out.println("equalsIgnoreCase:"+b1);

        //String subString(start,end) -->end index not included
        String p="Program";
        String p1=p.substring(1,5);
        System.out.println("subString:"+p1);

        //int compareTo()
        String q="ABC";
        String r="BCD";
        String s="ADC";
        System.out.println("compareTo:"+q.compareTo(r));
        System.out.println("compareTo:"+r.compareTo(s));

        //String replace(old,new)
        System.out.println("Replace:"+q.replace('A','a'));

        //String concat()
        String t="java";
        String t1="class";
        String y=t.concat(t1);
        System.out.println("Concat:"+y);
        System.out.println(t+" "+t1);     //+ operator is also used for concat

        //toCharArray();
        String d="JAVA";
        char[] cha=d.toCharArray();
        System.out.println("Char[]:"+cha);
        System.out.println(cha[2]);

    }
}
