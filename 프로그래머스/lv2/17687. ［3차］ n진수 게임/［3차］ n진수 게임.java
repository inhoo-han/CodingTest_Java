class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String str = "";
        
        for(int i = 0; i < t*m; i++) {
            str += Integer.toString(i, n);
        }
        
        for(int i = 0; i < t; i++) {
            answer += str.charAt( (p - 1) + (m * i) );
        }
        
        answer = answer.toUpperCase();
        return answer;
    }
}