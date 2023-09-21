import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        // [1] Character타입의 값을 저장하는 Stack 생성
        Stack<Character> stack = new Stack<>();
        
        // [2] 조건에 맞게 Stack에 값을 저장하거나 제거함
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);                   //기준문자
            
            // [3-1] stack에 저장된 최근 값과 기준 문자가 동일하면, 최근 저장된 값을 버림
            if(!stack.empty() && stack.peek() == a) {
                stack.pop();
            } 
            // [3-2] stack에 저장된 최근 값과 기준 문자가 동일하지 않으면, 기준 문자를 저장
            else {
                stack.push(a);
            }
        }

        answer = (stack.empty()? 1 : 0);
        return answer;
    }
}