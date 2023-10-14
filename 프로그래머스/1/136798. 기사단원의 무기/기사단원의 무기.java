import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] num = new int[number + 1];
        
        for(int n = 1; n <= number; n++) {
            int cnt = 0;
            for(int i = 1; i <= (int)Math.sqrt(n); i++) {
                if(n % i == 0) {
                    cnt++;
                    if(i * i != n) cnt++;
                }
            }
            if(cnt > limit) num[n] = power;
            else num[n] = cnt;
        }
        
        for(int i : num) {
            answer += i;
        }
        
        return answer;
    }
}