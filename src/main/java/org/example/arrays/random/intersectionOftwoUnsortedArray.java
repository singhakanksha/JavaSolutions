package org.example.arrays.random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class intersectionOftwoUnsortedArray {

    public static List intersectArray(int[] arr1, int[] arr2, List intersectionArray){
        Set tempset = new HashSet<Integer>();
        for(int i=0; i<arr1.length; i++){
            tempset.add(arr1[i]);
        }
        for(int i =0; i<arr2.length;i++){
            if(tempset.contains(arr2[i])){
                intersectionArray.add(arr2[i]);
            }
        }
        return intersectionArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,4,5,6};
        int[] arr2 = {1,2,3};

        List<Integer> intersectionArray = new ArrayList<Integer>();
        System.out.println(intersectArray(arr1, arr2, intersectionArray));
    }
}
