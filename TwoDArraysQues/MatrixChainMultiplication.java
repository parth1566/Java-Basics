package TwoDArraysQues;

import java.util.Arrays;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        
        int []p = {10, 30, 5, 60};

        int n = p.length - 1;
        
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }

        for(int len = 2; len <= n; len++) {         
            for(int i = 0; i <= n - len; i++) {       
                int j = i + len - 1;    
        
        dp[i][j] = Integer.MAX_VALUE;  

        for(int k = i; k < j; k++) {
            int cost = dp[i][k] + dp[k+1][j] + p[i] * p[k+1] * p[j+1];
            dp[i][j] = Math.min(dp[i][j], cost);

                }
            }
        }
            System.out.println("Minimum cost: " + dp[0][n-1]);
    }
}
