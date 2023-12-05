package com.Array;

public class AddBinary {

    //  https://leetcode.com/problems/add-binary/
    public static void main(String[] args) {
        String a="111";
        String b="101";
        AddBinary obj=new AddBinary();
        String res=obj.addBinary(a,b);
        System.out.println("Result="+res);
    }

    public String addBinary(String a,String b){
        int carry=0;
        String result="";
        int alen=a.length();
        int blen=b.length();
        int i=0;
        while(i<alen || i<blen || carry!=0){
            int x=0;
            if (i<alen && a.charAt(alen-1-i)=='1') x=1;

            int y=0;
            if (i<blen && b.charAt(blen-1-i)=='1') y=1;

            result=(x+y+carry)%2+result;
            carry=(x+y+carry)/2;
            i++;

        }
        return result;
    }
}
