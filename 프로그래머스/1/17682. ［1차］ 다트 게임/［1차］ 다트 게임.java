class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int prev = 0;               // 직전 점수
        int curr = 0;               // 현재 점수
        String str = "";
        
        // [1]
        for(int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            
            // 0~10
            if(ch >= 48 && ch <= 58) {
                prev = curr;
                str += (ch - '0');
                System.out.println(str);
                
                continue;
            }
            
            // S : 83, D : 68, T : 84
            else if(ch == 83 || ch == 68 || ch == 84) {
                curr = Integer.parseInt(str);
                
                if(ch == 68) curr = curr * curr;
                else if(ch == 84) curr = curr * curr * curr;
                
                answer += curr;
                str = "";
                
                continue;
            } 
            
            // * : 42
            else if(ch == 42) {
                answer = answer + curr + prev;
                curr *= 2;
                System.out.println("* : " + answer);
            }
            
            // # : 35
            else if(ch == 35) {
                answer -= curr * 2;
                curr *= -1;
            }
            
            prev = curr;
            
        }
        
        return answer;
    }
}