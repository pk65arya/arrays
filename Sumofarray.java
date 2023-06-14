package com.array;

public class Sumofarray {
    public static void main(String[] args) {
        int arraysum[]={1,2,3,4,5,6,7,8};

        int total=0;
        for(int i=0;i< arraysum.length;i++){
         //   total =arraysum[i];
            total += arraysum[i];
        }
        System.out.println(total);
    }
}
