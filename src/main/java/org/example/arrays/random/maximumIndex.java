/**
* Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.
* */
package org.example.arrays.random;

public class maximumIndex {
    public static void main(String[] args) {
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int[] arr2 = {1,10};
        int ans = maxindexOff(arr2);
        System.out.println(ans);
    }
    public static int maxindexOff(int[] arr){
      int maxIndex = 0;
      for(int i=0; i < arr.length ; i++){
          for(int j = arr.length - 1; j > i ; j--){
              if(arr[i] <= arr[j]){
                  int temp_maxIndex = j - i;
                  maxIndex = Math.max(maxIndex, temp_maxIndex);
              }
          }
      }
      return maxIndex;
    }
}
