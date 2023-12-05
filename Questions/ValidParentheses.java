package com.Array;

import java.util.Stack;

public class ValidParentheses {
    //https://leetcode.com/problems/valid-parentheses/submissions/
    public static void main(String[] args) {
        String s="({[})";
        ValidParentheses obj=new ValidParentheses();
        boolean result=obj.isValid(s);
        System.out.println(result);
    }

    public char getVal(char ch){
        switch (ch){
            case ')':return '(';
            case '}':return '{';
            case ']':return '[';
            default:return ' ';
        }
    }

    public boolean isValid(String s){
        String open="({[";
        String close=")}]";
        Stack<Character> st=new Stack<>();
        for (char ch:s.toCharArray()){
            if (open.indexOf(ch)!=-1){
                st.push(ch);
            }
            else {
                if (st.size()==0)
                    return false;
                char temp=st.pop();
                if (getVal(ch)!=temp)
                    return false;
            }
        }
        return st.size()==0;
    }
}

