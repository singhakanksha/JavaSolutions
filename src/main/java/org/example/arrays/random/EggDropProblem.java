package org.example.arrays.random;

public class EggDropProblem {
    public static int findMinAttemptForEggBreak(int eggs, int floors){
        if(eggs == 1){
            return floors;
        }
        if(floors == 0 || floors == 1){
            return floors;
        }
        int mn = Integer.MAX_VALUE;
        for(int k = 1; k <= floors; k++){
            int temp = 1 + Math.max(findMinAttemptForEggBreak(eggs-1,k-1),
                    findMinAttemptForEggBreak(eggs, floors-k));
            mn = Math.min(mn, temp);
        }
        return mn;
    }
    public static void main(String[] args) {
        int res = findMinAttemptForEggBreak(3,20);
        System.out.println(res);
    }
}
