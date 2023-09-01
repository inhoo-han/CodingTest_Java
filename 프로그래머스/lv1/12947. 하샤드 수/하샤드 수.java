class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        
        // [1] 입력값 x의 각 자릿수 합 구하기
        String strX = String.valueOf(x);
        int len = strX.length();
        int sum = 0;
        
        for(int i = len-1; i >= 0; i--) {
            int a = num / (int)(Math.pow(10, i));
            sum += a;
            num -= (int)(Math.pow(10, i))*a;
        }
        
        // [2] 입력값 x의 하샤드 수 여부 판단하기
        if(x % sum != 0) {
            answer = false;
        }
        
        
        return answer;
    }
}