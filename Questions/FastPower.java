package com.Array;

public class FastPower {
    //for a^b
    static int fastPower(int a,int b){
        int res=1;
        while (b>0){
            if((b&1)!=0){      //b&1 == b%2
                res=res*a;
            }
            a=a*a;
            b=b>>1;  //b>>1 == b/2
        }
        return res;
    }

    //for a^b%n-->it is used for large number

    static long fastPow(int a,int b,int n){
        long res=1;
        while (b>0){
            if( b%2!=0){
                res=(res*a%n)%n;
            }
            a=(a%n * a%n)%n;
            b=b/2;
        }
        return res;
    }

    public static void main(String[] args) {
        int result=fastPower(3,5);
        System.out.println("Compute a^b :"+result);

        long result2=fastPow(3978432,5,1000000007);
        System.out.println("Compute a^b%n :"+result2);
    }
}
