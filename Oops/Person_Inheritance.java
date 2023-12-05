package com.ClassRoom.Oops;

import java.util.*;
public class Person_Inheritance {
    public static void main(String[] args) {
        Patient obj=new Patient();
        obj.name="Rohan";
        obj.mNo="7987948810";
        obj.address="Akurdi Pune";
        obj.get();
        obj.display();
    }
}


class Person{
    String name;
    String mNo;
    String address;
}

class Patient extends Person{
    int id;
    int wardNo;
    String treatment;

    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Id:");
        id=sc.nextInt();
        System.out.println("Enter the wardNo:");
        wardNo=sc.nextInt();
        System.out.println("Enter the Treatment:");
        treatment=sc.nextLine();
    }

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Mobile No:"+mNo);
        System.out.println("Address:"+address);
        System.out.println("Id:"+id);
        System.out.println("WardNo:"+wardNo);
        System.out.println("Treatment:"+treatment);
    }

}



