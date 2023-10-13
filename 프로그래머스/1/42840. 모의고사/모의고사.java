import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        int[] num = {p1[0], p2[0], p3[0]};
        
        
        for(int i = 0; i < answers.length; i++) {
            
            if(i > 0) {
                num[0] = p1[i % p1.length];
                num[1] = p2[i % p2.length];
                num[2] = p3[i % p3.length];
            }
            
            for(int j = 0; j < 3; j++) {
                if(answers[i] == num[j]) score[j]++;
            }
        }
        
        int max = 0;
        for(int i : score) {
            if(i > max) max = i;
        }
        
        for(int i = 0; i < score.length; i++) {
            if(score[i] == max) answer.add(i + 1);
        }
        
        
        return answer;
    }
}