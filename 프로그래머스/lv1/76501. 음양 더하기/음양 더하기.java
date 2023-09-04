class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        // [1] 반복문을 사용하여 합계값 구하기
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i]) {
                answer += absolutes[i];
            } else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}