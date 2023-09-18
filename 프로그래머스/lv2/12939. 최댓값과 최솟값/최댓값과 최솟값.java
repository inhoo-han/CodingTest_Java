class Solution {
    public String solution(String s) {
        String answer = "";
        String[] parts = s.split(" ");
        int max = -99999999, min = 99999999;
        
        for(int i = 0; i < parts.length; i++) {
            int part = Integer.parseInt(parts[i]);
            
            if(part > max) {
                max = part;
            }
            
            if(part < min) {
                min = part;
            }
        }
        
        answer = min + " " + max;
        return answer;
    }
}