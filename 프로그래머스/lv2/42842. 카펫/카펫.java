class Solution {
    public int[] solution(int brown, int yellow) {
        int a = 0, b = 0;
        int[] answer = {a, b};
        
        for(int i = 1; i < brown / 2; i++) {
            a = brown / 2 - i + 2;
            b = i;
            
            if((a - 2) * (b - 2) == yellow) break;
        }
        
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
}