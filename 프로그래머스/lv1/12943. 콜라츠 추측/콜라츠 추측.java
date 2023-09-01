class Solution {
    public int solution(long num) {
        int count = 0;
        
        // [1] 반복문 만들기
        while(num != 1) {
            
            // [2] 1-1, 1-2의 조건문 만들기
            if(num % 2 == 0) {
                num = num / 2;
                count++;
            } else {
                num = num * 3 + 1;
                count++;
            }
            
            // [3] 2의 조건문 만들기
            if(count > 500) {
                count = -1;
                break;
            }
        }
        
        return count;
    }
}