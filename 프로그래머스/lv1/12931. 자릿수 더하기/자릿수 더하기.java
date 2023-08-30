import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str_n = String.valueOf(n);
    
        for(int i = 0; i < str_n.length(); i++){
            answer += str_n.charAt(i) - '0';
        }
        
        return answer;
    }
}