class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] date = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int tot = 0;
        
        for(int i = 0; i < a; i++) {
            tot += date[i];
        }
        
        answer = day[(tot + b) % 7];
        
        return answer;
    }
}