class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // [1] n을 2진수로 바꾸어 1의 개수 카운트
        String n2 = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < n2.length(); i++) {
            if(n2.charAt(i) == '1') count++; 
        }
        
        // [2] 1의 개수가 같은 n보다 큰 수 찾기
        for(int i = n + 1; i <= 1000000; i++) {
            String i2 = Integer.toBinaryString(i);
            int countI = 0;
            
            for(int j = 0; j < i2.length(); j++) {
                if(i2.charAt(j) == '1') countI++;
            }
            
            if(countI == count) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}