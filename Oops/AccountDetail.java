package com.ClassRoom.Oops;

class Account{
    int acc_no;
    String name;
    float amount;

    void insertRecord(int acc,String accHolder,float amt){
        acc_no=acc;
        name=accHolder;
        amount=amt;
    }

    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+"Amount deposited");
    }

    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient amount");
        }
        else{
            amount=amount-amt;
            System.out.println(amt+"Withdraw");
        }
    }

    void checkBalance(){
        System.out.println("Balance:"+amount);
    }

    void accountDetail(){
        System.out.println(acc_no+" "+name+" "+amount);
    }
}
public class AccountDetail {
    public static void main(String[] args) {
        Account obj=new Account();
        obj.insertRecord(14520,"Keshav",5000);
        obj.deposit(1000);
        obj.withdraw(1500);
        obj.checkBalance();
        obj.accountDetail();
    }
}
