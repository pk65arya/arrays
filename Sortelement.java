package com.array;

public class Sortelement {
    public static void main(String[] args) {
        int [] arr={3,2,1,5,4};
        System.out.println("elements of array after sort is:");
int temp=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
            System.out.println(arr[i]);
        }

    }
}
