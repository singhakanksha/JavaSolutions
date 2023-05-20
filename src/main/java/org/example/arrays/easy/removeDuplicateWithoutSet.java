package org.example.arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class removeDuplicateWithoutSet {

    public static ArrayList removeDuplicate(int[] dupArr){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList ls = new ArrayList();
        for(int i=0 ; i < dupArr.length-1; i++){
            if(!map.containsKey(dupArr[i])){
                map.put(dupArr[i],1);
            }else{
                 Integer value =  map.get(dupArr[i]);
                map.put(dupArr[i], value + 1);
            }
        }


        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                Integer key = entry.getKey();
                ls.add(key);
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate(new int[]{1,2,2,3,3,5,6,2}));
    }
}
