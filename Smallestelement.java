package com.array;

public class Smallestelement {
    public static void main(String[] args) {
        int [] arr={8,3,7,5,4};
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element : " +smallest);
    }
}
