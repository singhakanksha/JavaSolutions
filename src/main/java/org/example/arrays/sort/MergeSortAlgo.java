package org.example.arrays.sort;

import java.util.Arrays;

public class MergeSortAlgo {
    public static void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        int idx1 = l;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= r) {
            if (arr[idx1] <= arr[idx2]) {
                temp[x++] = arr[idx1++];
            } else {
                temp[x++] = arr[idx2++];
            }
        }
        if(idx1 <= mid){
            while (idx1 <= mid) {
                temp[x++] = arr[idx1++];
            }
        }else if(idx2<=r){
            while (idx2 <= r) {
                temp[x++] = arr[idx2++];
            }
        }


        for (int i = 0, j = l; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
    }
    public static void mergeSort(int[]arr,int l, int r){
        if(l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,8,4,3,2,9,3,5};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
//        for(int ele : arr){
//          System.out.println(ele);
//        }
    }
}
