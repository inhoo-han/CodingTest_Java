class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean sw = true;
        
        while (sw) {
            answer++;
            for(int i = 0; i < arr.length; i++) {
                if(answer % arr[i] != 0) {
                    sw = true;
                    break;
                } else {
                    sw = false;
                }
            }
        }
        
        return answer;
    }
}