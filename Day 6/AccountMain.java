package accEncap;

import java.util.*;

public class AccountMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Scanner St=new Scanner(System.in);
        System.out.println("Enter Acc no: ");
        long a= sc.nextLong();
        System.out.println("Enter Name: ");
        String b= St.nextLine();
        System.out.println("Enter Age: ");
        int c= sc.nextInt();
        System.out.println("Enter Amt: ");
        float d= sc.nextFloat();
        accEncap.AccountEncap en = new accEncap.AccountEncap();
        en.setAcc_num(a);
        en.setName(b);
        en.setAge(c);
        en.setAmt(d);
        System.out.println("Name: "+ en.getName());
        System.out.println("Age: "+en.getAge());
        System.out.println("Account number: "+en.getAcc_num());
        System.out.println("Amount: "+en.getAmt());
    }
}