import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        int count = 0;
        
        // [1] divisor로 나누어떨어지는 arr의 요소 개수 확인
        for(int i = 0; i < arr.length; i++) {
           if(arr[i] % divisor == 0) {
               count++;
           } 
        }
        
        // [2] count의 개수가 0보다 클 때 새로운 배열 생성
        if(count > 0) {
            answer = new int[count];
        }
        
        // [3] 새로운 배열에 값 추가
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[count - 1] = arr[i];
                count--;
            }
            
            if(count == 0) {
                break;
            }
        }
        
        
        // [] 배열을 오름차순으로 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}