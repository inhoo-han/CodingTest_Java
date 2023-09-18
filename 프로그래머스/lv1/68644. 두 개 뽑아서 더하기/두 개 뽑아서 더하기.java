import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> ts = new TreeSet<>();
        
        // 더한 결과를 TreeSet에 담기
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                ts.add(numbers[i] + numbers[j]);
            }
        }
        
        // TreeSet에 담긴 결과를 배열로 변경
        int[] answer = new int[ts.size()];
        int index = 0;
        for(int num : ts) {
            answer[index++] = num;
        }
        
        return answer;
    }
}