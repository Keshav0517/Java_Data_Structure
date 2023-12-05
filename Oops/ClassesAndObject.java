package com.ClassRoom.Oops;

import java.util.Scanner;

class Student{
    int id;
    String name;
    String school;
    String contact;
    String address;


    void insertRecord(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Id:");
        id=sc.nextInt();
        System.out.println("Enter Student Name:");
        name=sc.next();
        System.out.println("Enter Student School:");
        school=sc.next();
    }


    void display(){
        System.out.println("Student ID:"+id);
        System.out.println("Student Name:"+name);
        System.out.println("Student School:"+school);
        System.out.println("Student Contact:"+contact);
        System.out.println("Student Address:"+address);
    }
}
public class ClassesAndObject {
    public static void main(String[] args) {
        //Student s=new Student();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Student:");
        int n=sc.nextInt();
        //array of object
        Student[] stu=new Student[n];
        for (int i=0;i<n;i++){
            stu[i]=new Student();
            stu[i].insertRecord();
            stu[i].display();
            System.out.println();

        }

        /*
        s.contact="7987948810";
        s.address="Kharadi Pune";
        s.insertRecord();
        s.display();

         */

    }
}
