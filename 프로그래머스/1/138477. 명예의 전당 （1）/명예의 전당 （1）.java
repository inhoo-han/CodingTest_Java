import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        
        for(int i : score) {
            
            if(list.size() < k) list.add(i);
            else {
                if(list.get(0) < i) {
                    list.remove(0);
                    list.add(i);
                }
            }
            
            Collections.sort(list);
            
            answer[idx] = list.get(0);
            idx++;
        }
        
        
        return answer;
    }
}