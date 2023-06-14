package com.array;

public class Reversearray {
    public static void main(String[] args) {
        int [] array=new int[]{1,2,3,4,5,};
        System.out.println("array before reverse is:");
     for(int i=0;i< array.length;i++) {

         System.out.print(array[i]+ " ");

     }
        System.out.println("\n");
             System.out.println("array after reverse is:");
     for(int i=array.length-1;i>=0;i--){
         System.out.print(array[i]+ " ");
     }
    }
}
