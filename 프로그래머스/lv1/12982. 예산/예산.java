import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // [1] 배열 d를 오름차순 정렬
        Arrays.sort(d);
        
        // [2] 반복문 돌면서 지원 가능한 부서 개수 추출
        for(int i = 0; i < d.length; i++) {
            if(d[i] <= budget) {
                budget -= d[i];
                answer ++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}