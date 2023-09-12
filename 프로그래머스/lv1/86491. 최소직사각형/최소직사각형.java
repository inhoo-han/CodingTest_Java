import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max0 = 0, max1 = 0;
        
        // [1] sizes 배열 정렬후 가장 큰 값 저장
        for(int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            
            if(sizes[i][0] > max0) max0 = sizes[i][0];
            if(sizes[i][1] > max1) max1 = sizes[i][1];
        }
        
        // [2] answer의 값 구함
        answer = max0 * max1;
        
        return answer;
    }
}