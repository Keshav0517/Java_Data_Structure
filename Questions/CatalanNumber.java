package com.Array;

public class CatalanNumber {
    //Recrusive
    int catalan(int n){
        int res=0;
        if(n<=1){
            return 1;
        }

        for(int i=0;i<n;i++){
            res=res+catalan(i)*catalan(n-i-1);
        }
        return res;
    }

    //Dynamic Programming
    static int catalanDP(int n){
        int catalan[] = new int[n+2];
        catalan[0]=1;
        catalan[1]=1;

        for (int i=2;i<=n;i++){
            catalan[i]=0;
            for (int j=0;j<i;j++){
                catalan[i] += catalan[j]*catalan[i-j-1];
            }
        }
        return catalan[n];
    }

    public static void main(String[] args) {
        CatalanNumber obj=new CatalanNumber();
        int result=obj.catalan(5);
        System.out.println("Result based on Recursive:"+result);

        //int result2= obj.catalanDP(5); for static method,their is no need to use object
        System.out.println("Result based on Dynamic Programming:"+catalanDP(5));
    }
}
