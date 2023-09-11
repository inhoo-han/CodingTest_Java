import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        // [1] ArrayList타입 변수 생성
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // [2] 반복문 돌면서 중복이 아닌 값만 저장
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i+1]) {
                list.add(arr[i]);
            }
            if(i == arr.length - 2) {
                list.add(arr[arr.length-1]);
            }
        }
        
        // [3] list에 있는 값을 answer에 대입
        answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}