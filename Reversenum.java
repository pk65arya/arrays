package com.array;

public class Reversenum {
    public static void main(String[] args) {
        int num=1234,rev=0;

        System.out.println("number before reverse is :"+num);

        while(num!=0){
            int rem=num%10;
             rev=rev*10+rem;
             num=num/10;
        }
        System.out.println("number after reverse is:"+rev);
    }
}
