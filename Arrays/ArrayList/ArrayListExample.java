package com.ClassRoom.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        /*


        //Syntax
        ArrayList<Integer> list=new ArrayList<Integer>(5);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        //update
        list.set(0,5);
        System.out.println(list);

        //check perticular value in list or not
        System.out.println(list.contains(30));

        //remove
        list.remove(0);
        System.out.println(list);

        //isEmpty()
        System.out.println(list.isEmpty());

        //Add value at specific index
        list.add(4,60);
        System.out.println(list);

         */

        //input by using scanner class
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(5);
        System.out.print("Enter the Elements:");
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        //sorting Collections.sort();
        Collections.sort(list);

        //Display elements
        for (int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");  //get() is used to return the index value
        }

        System.out.println();


        ArrayList<String> lis=new ArrayList<>();
        lis.add("Mangoes"); //Element of an arraylist is-object
        lis.add("Apple");
        lis.add("Banana");
        System.out.print(lis);

        System.out.println();

        //set() is used to updates the values to pass index
        lis.set(1,"Dates");

        //Traverse an ArrayList by using iterator
        Iterator itr=lis.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
