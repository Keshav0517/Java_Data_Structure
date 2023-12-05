package com.ClassRoom.String;

public class ParsingTechnique {
    public static void main(String[] args) {
        //parsing technique is used to convert String to number and number to string
        //String to Number
        String s1="121";
        byte a=Byte.parseByte(s1);
        short b=Short.parseShort(s1);
        int c=Integer.parseInt(s1);
        long d=Long.parseLong(s1);
        float e=Float.parseFloat(s1);
        double f=Double.parseDouble(s1);

        System.out.println(a);
        System.out.println(e);

        //number to String
        int n=1256;
        String s2=Integer.toString(n);
        System.out.println("String s2:"+s2);

        byte n1=14;
        String s3=Byte.toString(n1);

        System.out.println("String s3:"+s3);
    }
}
