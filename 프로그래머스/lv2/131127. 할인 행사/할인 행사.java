class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for(int i = 0; i < discount.length - 9; i++) {      // 할인품목
            int j;
            for(j = 0; j < want.length; j++){                   // want 항목 반복
            
                int count = 0;
                for(int k = i; k < i + 10; k++){                // 할인품목 열 개씩
                    if(want[j].equals(discount[k])) {
                        count++;
                    }
                }
                if(count < number[j]) break;
            }
            if(j == want.length) answer++;
        }
        
        return answer;
    }
}