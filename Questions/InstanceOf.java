package com.ClassRoom;

public class InstanceOf {
    public static void main(String[] args) {
        Thread t=new Thread();
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Runnable);
        //System.out.println(t instanceof String);  //ce:incompatible types: java.lang.Thread cannot be converted to java.lang.String
        System.out.println(null instanceof Object);
        System.out.println(null instanceof Runnable);
        System.out.println(null instanceof Thread);
    }
}

