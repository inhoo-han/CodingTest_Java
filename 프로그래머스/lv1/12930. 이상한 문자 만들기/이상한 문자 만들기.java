class Solution {
    public String solution(String s) {
        String answer = "";
        boolean sw = true;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer += s.charAt(i);
                sw = true;
                continue;
            }
            
            if(sw) {
                answer += Character.toUpperCase(s.charAt(i));
                sw = !sw;
                continue;
            } else {
                answer += Character.toLowerCase(s.charAt(i));
                sw = !sw;
                continue;
            }
        }
        
        return answer;
    }
}