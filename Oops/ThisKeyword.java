package com.ClassRoom.Oops;

import java.util.Scanner;

class Employee{
    /* this keyword for invoke current class variables */
    int id;
    String name;
    String company;
    String contact;

    Employee(int id,String name,String contact){
        this.id=id;
        this.name=name;
        this.contact=contact;
    }

    Employee(int id ,String name,String contact,String company){
        this(id,name,contact);              //Reuse of constructor
        this.company=company;
    }

    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Contact:"+contact);
        System.out.println("Company:"+company);
    }

    /* this keyword for Method */
    void m(){
        System.out.println("Method M:");
    }
    void n(){
        System.out.println("Method N:");
        this.m();
    }

    /* invoke current class constructor by using this() */
    Employee(){
        System.out.println("Default constructor:");
    }

    Employee(int x){
        this();
        System.out.println(x);
    }

}
public class ThisKeyword {
    public static void main(String[] args) {
        Employee obj=new Employee(101,"Rohan","7987948810","Wipro");
        obj.display();
        obj.n();


        System.out.println();

        Employee obj1=new Employee(102,"Tejas","7999833006","Accenture");
        obj1.display();
        obj1.n();

        System.out.println();

        Employee obj2=new Employee(10);




    }
}
