package com.ClassRoom.Oops;

class Stu{
    int rollNo;
    String name;
    static String college="DPCOE";

    static {
        System.out.println("Static Block Execute Before main() Execute");
        System.out.println();
    }

    static void change(){
        college="Dhole patil college of Engineering";
    }

    Stu(int roll,String n){
        rollNo=roll;
        name=n;
    }

    void display(){
        System.out.println("Roll No:"+rollNo);
        System.out.println("Student name:"+name);
        System.out.println("College:"+college);
        System.out.println();
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Stu obj=new Stu(48,"Keshav");
        obj.display();

        Stu.change();
        obj.display();
    }
}
