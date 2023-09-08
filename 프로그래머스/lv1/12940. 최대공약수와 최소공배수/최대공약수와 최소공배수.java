class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {1, 1};
        
        // [1] 최대공약수 구하기
        for(int i = n; i > 0; i--) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }
        
        // [2] 최소공배수 구하기
        for(int i = m; i <= 1000000; i++) {
            if(i % n == 0 && i % m == 0) {
                answer[1] = i;
                break;
            }
        }
        
        return answer;
    }
}