import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int min = 12345678;
        int indexNum = 0;
        
        // [1] 배열의 크기가 2이상인 경우만 해당
        if (arr.length > 1) {
            
            // [2] 배열에서 가장 작은 숫자와 인덱스번호를 찾음
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                    indexNum = i;
                }
            }    
            
            // [3] 해당 인덱스번호를 제외한 배열을 생성
            
            answer = new int[arr.length - 1];
            
            for(int j = 0; j < indexNum; j++) {
                answer[j] = arr[j];
            }
            for(int k = indexNum; k < arr.length - 1; k++) {
                answer[k] = arr[k + 1];
            }
            
            
        }
        
        return answer;
    }
}