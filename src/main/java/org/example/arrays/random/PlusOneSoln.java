package org.example.arrays.random;

import java.util.Arrays;

public class PlusOneSoln {

    public static int[] plusOne(int[]arr){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }else{
                arr[i] = 0 ;
            }
        }
        int[] temp = new int[arr.length + 1];
        temp[0] = 1;
        return temp;
    }
    public static void main(String[] args) {
        int [] arr1 = new int[]{1,2,3};
        int [] arr2 = new int[]{1,2,9};
        int [] arr3 = new int[]{9,9,9};
        System.out.println(Arrays.toString(plusOne(arr1)));
        System.out.println(Arrays.toString(plusOne(arr2)));
        System.out.println(Arrays.toString(plusOne(arr3)));
    }
}
