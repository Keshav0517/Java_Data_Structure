package com.ClassRoom.Oops;

class First{
    static int x=10;
    static int y=20;
    //int count=0;                       //Without static output-->1,1,1
    static int count=0;                  //With static output-->1,2,3

    First(){
        count++;
        System.out.println("Count:"+count);
    }

}
public class StaticVariable {
    public static void main(String[] args) {
        First obj=new First();
        First obj2=new First();
        First obj3=new First();

        /*
        System.out.println(obj.x);
        System.out.println(obj.y);                //Object name
        System.out.println(First.y);             //Class name

        int x=30;
        System.out.println(x);

        int y=40;
        System.out.println(y);

        First.y=50;                             //We can change the value of static variable
        System.out.println(First.y);

         */
    }
}
