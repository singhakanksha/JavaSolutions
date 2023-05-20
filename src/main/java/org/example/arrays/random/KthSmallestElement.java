package org.example.arrays.random;

import java.util.PriorityQueue;
import java.util.Collections;

public class KthSmallestElement {

    public static int kthSmallestElementMethod(int[] arr, int k){
        // max heap
        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<Integer>(Collections.<Integer>reverseOrder());
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(); // min heap
        for(int i = 0; i < k ; i++){
            priorityQueue.add(arr[i]);
        }
        for(int j = k ; j < arr.length; j++){
            if(arr[j] < priorityQueue.peek()){
                priorityQueue.remove();
                priorityQueue.add(arr[j]);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        //20, 10,60
//        PriorityQueue<Integer> priorityQueueReverse = new PriorityQueue<Integer>(Collection.reve);
//        priorityQueue.add(5);
//        priorityQueue.add(0);
//        priorityQueue.add(30);
//        System.out.println(priorityQueue.peek());
//        System.out.println(priorityQueue.poll());

        int res = kthSmallestElementMethod(new int[]{10,20,30,40,50,70}, 4);
        System.out.println(res);
    }

}
