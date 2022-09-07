package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        boolean flag=true;
        while(flag){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int a=arr[i];
                    int b=arr[i+1];
                    arr[i+1]=a;
                    arr[i]=b;
                }
            }
        }


    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        return null;
    }
}
