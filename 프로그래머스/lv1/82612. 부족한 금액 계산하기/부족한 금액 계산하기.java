class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        
        // [1] 반복문 돌면서 count번 탔을 때 금액 계산
        for(int i = 1; i <= count; i++) {
            sum += i * price;
        }
        
        // [2] 차액 계산
        if(sum - money >= 0) {
            answer = sum - money;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}