package com.ClassRoom.Questions;

public class FindLcmAndHcf {
    public static void main(String[] args) {
        //LCM
        int num1=4,num2=5;
        int a=2,b=3;
        FindLcmAndHcf obj=new FindLcmAndHcf();
        System.out.println(obj.lCM(num1,num2));
        System.out.println(obj.hCF(num1,num2));
        System.out.println("GCD:"+obj.gCD(a,b));
    }

    public static int lCM(int num1,int num2){
        int mp;
        if (num1>num2){
            mp=num1;
        }
        else
            mp=num2;

        while (true){
            if ((mp%num1==0) && (mp%num2==0)){
                break;
            }
            else
                mp++;

        }
        System.out.print("LCM:");
        return mp;
    }

    public static int hCF(int num1,int num2){
        int mp;
        if (num1<num2){
            mp=num1;
        }
        else
            mp=num2;

        while (true){
            if ((num1%mp==0) && (num2%mp==0)){
                break;
            }
            else
                mp--;
        }
        System.out.print("HCF:");
        return mp;
    }

    //gcd and hcf both are same
    public static int gCD(int a,int b){
        if (b==0){
            return a;
        }
        return gCD(b,a%b);
    }
}
