class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int sumZero = 0, dep = 0;
        
        while (true) {
            if(s.equals("1")) break;
            
            int sumOne = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') sumZero ++;
                else sumOne ++;
            }
            
            s = Integer.toBinaryString(sumOne);
            dep ++;
        }
        
        answer[0] = dep;
        answer[1] = sumZero;
        
        return answer;
    }
}