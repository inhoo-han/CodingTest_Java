class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int t_len = t.length();
        int p_len = p.length();
        
        // [1] 부분문자열을 구해 비교
        for(int i = 0; i <= t_len - p_len; i++) {
            if(Long.parseLong(t.substring(i, i + p_len)) 
               <= Long.parseLong(p)) {
                answer ++;
            }
        }
        
        return answer;
    }
}