import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // [1] 역삼진법으로 변경
        while(true) {
            if(n / 3 > 0) {
                list.add(n % 3);
                n = n / 3;
            } else {
                list.add(n);
                break;
            }
        }
        
        
        // [2] 역삼진법을 십진법으로 변경
        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(3, list.size() - 1 - i);
            System.out.print(answer);
        }
        
        return answer;
    }
}