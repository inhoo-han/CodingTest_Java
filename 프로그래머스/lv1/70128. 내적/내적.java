class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        // [1] 반복문 돌며 내적 구하기
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        
        return answer;
    }
}