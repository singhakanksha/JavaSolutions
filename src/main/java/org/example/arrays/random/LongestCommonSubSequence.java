/**
* Given two sequences, find the length of longest subsequence present in both of them. Both the strings are of uppercase.
*
* */
package org.example.arrays.random;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
        int ans = longestCommonSubSequence(3,2,"abc","ac");
        System.out.println(ans);
    }

    public static int longestCommonSubSequence(int m,int n, String a, String b){
        int dp[][] = new int[m+1][n+1];
        for(int i=0; i< m + 1 ; i++){
            for(int j=0; j< n + 1; j++){
                dp[i][j] = -1;
            }
        }
        return lcsUtil(m,n,a,b,dp);
    }
    public static int lcsUtil(int m, int n, String a, String b, int[][]dp){
        if(m==0 || n==0){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        if(a.charAt(m-1) == b.charAt(n-1)){
            dp[m][n] = 1 + lcsUtil(m-1,n-1,a,b,dp);
            return dp[m][n];
        }else{
            return dp[m][n] = Math.max(
                    lcsUtil(m,n-1,a,b,dp),
                    lcsUtil(m-1,n,a,b,dp)
            );
        }
    }
}
