package com.ClassRoom.Oops;

class Bike{
    int bikeNo;
    String name;
    int model;

    //Default Constructor
    Bike(){
        System.out.println("Default Constructor");
        System.out.println();
    }

    //Parametrized Constructor And Constructor Overloading
    Bike(int bN,String n,int mod){
        bikeNo=bN;
        name=n;
        model=mod;
    }

    Bike(int bN,int mod){
        bikeNo=bN;
        model=mod;
    }

    void display(){
        System.out.println("Bike No:"+bikeNo);
        System.out.println("Name:"+name);
        System.out.println("Model:"+model);
        System.out.println();
    }
}
public class Constructor {
    public static void main(String[] args) {
        Bike obj=new Bike();
        Bike obj1=new Bike(8005,"Honda",2012);
        Bike obj2=new Bike(1414,2000);
        obj1.display();
        obj2.display();
    }
}
