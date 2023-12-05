package com.ClassRoom;

public class Increment_Decrement {
    public static void main(String[] args) {
        int x=10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(--x);
        System.out.println(x--);

        int y=9;
        System.out.println("++Y ="+ ++y);
        System.out.println("y-- ="+ y--);
        System.out.println("--y ="+ --y);
        System.out.println("y++ ="+ y++);
        System.out.println("y++ ="+ y++);

        int z=75;
        System.out.println("z++ ="+ z++);
        System.out.println("++z ="+ ++z);
        System.out.println("z++ ="+ z++);
        System.out.println("z-- ="+ z--);
        System.out.println("--z ="+ --z);
        System.out.println("--z ="+ --z);

        int p=65;
        System.out.println("++p ="+ ++p);
        System.out.println("--p ="+ --p);
        System.out.println("p-- ="+ p--);
        System.out.println("p++ ="+ p++);
        System.out.println("p++ ="+ p++);
        System.out.println("--p ="+ --p);
        System.out.println("p-- ="+ p--);

        int q=65;
        System.out.println("++q="+ ++q);
        //System.out.println(++(++q));  //ce:unexcepted type req:variable,found:value
        //System.out.println((q++)++);  //ce:unexcepted type req:variable,found:value
        //System.out.println(++(q));
        System.out.println("++q="+ +(+q));



    }
}
