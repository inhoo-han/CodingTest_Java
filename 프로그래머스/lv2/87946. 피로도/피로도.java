import java.util.*;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        
        // [1] 행렬 정렬
        Comparator<int[]> asc = (a, b) -> {
            int compA = a[0] - a[1];
            int compB = b[0] - b[1];
            return Integer.compare(compA, compB); 
        };
        
        Arrays.sort(dungeons, asc);
        
        // [1] dp
        int n = dungeons.length;
        int[][] dp = new int[n+1][k+1];
        
        for(int i = 1; i < n + 1; i++) {
            for(int r = 1; r < k + 1; r++) {
                if(dungeons[i-1][0] > r) {
                    dp[i][r] = dp[i-1][r];
                } else {
                    dp[i][r] = Math.max(dp[i-1][r], 1 + dp[i-1][r-dungeons[i-1][1]]);
                }
            }
        }
        
        answer = dp[n][k];
        return answer;
    }
}