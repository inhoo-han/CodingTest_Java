class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        
        // [1] s의 길이가 4~6인지 판별
        if (length != 4 && length != 6) {
            answer = false;
            return answer;
        }
        
        // [2] s가 숫자로만 구성되어 있는지 판별
        try {
            int ss = Integer.parseInt(s);
            ss = ss / 1;
        } catch(Exception e) {
            answer = false;
        }
        
        return answer;
    }
}