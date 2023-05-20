package org.example.arrays.easy;

public class printNumbersWithoutLoop {
//    public static void print(int start, int end){
//       while(start <= end){
//           System.out.println(start);
//           start= start + 1;
//       }
//    }

     public static void printM(int start,int end){
         if(start<=end){
             System.out.println(start);
             printM(start+1, end);
         }
     }
    public static void main(String[] args) {
        printM(1,100);
    }
}
