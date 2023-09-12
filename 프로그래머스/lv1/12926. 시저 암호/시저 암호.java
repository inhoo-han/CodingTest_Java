class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] array = new char[s.length()];
        
        // [1] 문자열을 배열로 저장
        for(int i = 0; i < array.length; i++) {
            array[i] = s.charAt(i);
            
            if(array[i] == ' ') array[i] = ' ';
            
            if(array[i] >= 65 && array[i] <= 90) {
                if(array[i] + n > 90) {
                    array[i] = (char)(array[i] - 26 + n);
                } else {
                    array[i] = (char)(array[i] + n);
                }
            }
            
            if(array[i] >= 97 && array[i] <= 122) {
                if(array[i] + n > 122) {
                    array[i] = (char)(array[i] - 26 + n);
                } else {
                    array[i] = (char)(array[i] + n);
                }
            }
            
            answer += array[i];
        }
        
        return answer;
    }
}