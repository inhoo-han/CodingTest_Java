import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        // 음식 세팅하는 함수
        for(int i = 1; i < food.length; i++) {
            int share = food[i] / 2;
            System.out.println(share);
            
            // 몫이 0인 경우 넘김
            if(share == 0) {
                continue;
            }
            
            for(int j = 1; j <= share; j++) {
                answer += String.valueOf(i);
            }
        }
        
        answer += String.valueOf(0);
        
        for(int i = answer.length() - 2; i >= 0; i--) {
            answer += String.valueOf(answer.charAt(i));
        }
            
        return answer;
    }
}