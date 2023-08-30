class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        
        for(int i = left; i <= right; i++) {
            // [1] 제곱근 구하기
            double sqrt = Math.sqrt(i);

            // [2] 제곱근이 double인지 int인지 판단
            if (sqrt % 1 != 0) {
                answer += i;
            } else {
                answer -= i;
            }

        }
        
        return answer;
    }
}