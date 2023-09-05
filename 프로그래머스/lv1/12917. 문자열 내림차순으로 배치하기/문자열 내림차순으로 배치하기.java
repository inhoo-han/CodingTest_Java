import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // [1] 문자열의 크기와 동일한 배열 만들기
        char[] array = new char[s.length()];
        
        // [2] 문자열을 따로 떼어 배열에 저장하기
        for(int i = 0; i < array.length; i++) {
            array[i] = s.charAt(i);
        }
        
        // [3] 배열 정렬하기
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(array[i] < array[j]) {
                    char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        // [4] 배열을 문자열로 변경
        for(int k = 0; k < array.length; k++) {
            answer += array[k];
        }
        
        
        
        return answer;
    }
}