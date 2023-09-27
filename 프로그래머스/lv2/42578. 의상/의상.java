import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        // [1] 옷의 종류를 키로, 개수를 값으로 저장하는 HashMap 생성
        Map<String, Integer> map = new HashMap<>();
        
        // [2] 있는 옷의 종류일 경우 값 + 1, 처음 보는 옷의 종류일 경우 1을 저장
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        // [3] 카운트는 1부터 시작
        int count = 1;
        
        // [4] 값을 하나씩 가져와 + 1 한 뒤, 카운트와 곱함 (경우의 수)
        for(String key : map.keySet()) {
            count *= map.get(key) + 1;
        }
        
        // [5] 모든 종류의 옷이 없는 경우 한 가지를 제외
        answer = count - 1;
        
        return answer;
    }
}