package com.array;

public class Largestelement {
    public static void main(String[] args) {
        int [] array=new int[] {3,5,2,4,1,7,6};
        int largest=array[0];

        for (int i=1;i< array.length;i++){
           //
            if(largest<array[i])
            {
                largest = array[i];
            }
        }
        System.out.println("largest element : " +largest);
    }
}
