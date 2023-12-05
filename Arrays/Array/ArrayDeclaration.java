package com.ClassRoom.Arrays.Array;

import java.util.*;

public class ArrayDeclaration {
    public static void main(String[] args) {

        /*

        //One Dimension array
        int arr[]=new int[10];    //Dynamic memory allocation
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[5]=40;
        arr[4]=50;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("");

        int arr2[]={10,20,30,40,50};  //Static memory allocation
        for (int a:arr2){
            System.out.print(a+",");
        }

        int arr3[];
        arr3=new int[]{10,20,30,40,50}; //Dynamic memory allocation

        int arr4[];
        arr4=new int[5];  //Dynamic memory allocation

        //Find return type of any array
        int[] array=new int[5];
        String[] array1=new String[2];
        byte[] array2=new byte[3];
        float[] array3=new float[4];
        System.out.println(array.getClass().getName());
        System.out.println(array1.getClass().getName());
        System.out.println(array2.getClass().getName());
        System.out.println(array3.getClass().getName());

        //Allowed data types in array size:-int,byte,short,char
        int array4[]=new int[10];

        int i=10;
        array4=new int[i];
        System.out.println(array4);

        char ch='a';
        array4=new int[ch];
        System.out.println(array4);

        byte b=56;
        array4=new int[b];
        System.out.println(array4);

        short s=478;
        array4=new int[s];
        System.out.println(array4);

        int array5[]=new int[5];
        System.out.println("Default Value:"+array5[0]);

        boolean[] array6=new boolean[2];
        System.out.println("Default Value:"+array6[0]);

        String[] array7=new String[3];
        System.out.println("Default Value:"+array7[0]);

        String str=null;  //Non primitives can be assigned by null literal

        //Enter values by user
        int[] arr1=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements:");
        for (int j=0;j<arr1.length;j++){
            arr1[j]=sc.nextInt();
        }

        //Display elements by using for loop
        for (int index=0;index<arr1.length;index++){
            System.out.print(arr1[index]+",");
        }

        System.out.println("");

        //Display elements by using for each loop
        for (int ref:arr1){
            System.out.print(ref+",");
        }

        System.out.println("");

        //Display elements by using toString method
        System.out.print(Arrays.toString(arr1));


         */

        //Array of objects
        Scanner in=new Scanner(System.in);
        String[] str1=new String[4];
        System.out.println("Enter the String:");
        for (int ind=0;ind< str1.length;ind++){
            str1[ind]=in.next();
        }

        System.out.print(Arrays.toString(str1));

        //modify
        str1[2]="tejas";

        System.out.println(Arrays.toString(str1));


    }
}
