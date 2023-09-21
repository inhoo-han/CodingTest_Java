class Solution {
    public long solution(int n) {
        long answer = 0;
        int[] fibo = new int[n + 2];
        fibo[0] = 0;
        fibo[1] = 1;
        
        for(int i = 2; i < fibo.length; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1234567;
        }
        
        return fibo[n + 1];
    }
}