class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = (s.toLowerCase()).toCharArray();
        
        chars[0] = Character.toUpperCase(chars[0]);
        
        for(int i = 0; i < chars.length - 1; i++) {
            if(s.charAt(i) == ' ') {
                if(s.charAt(i + 1) != ' ') {
                    chars[i + 1] = Character.toUpperCase(chars[i + 1]);
                } else {
                    continue;
                }
            }
        }
        
        for(char ch : chars) {
            answer += String.valueOf(ch);
        }
        
        return answer;
    }
}