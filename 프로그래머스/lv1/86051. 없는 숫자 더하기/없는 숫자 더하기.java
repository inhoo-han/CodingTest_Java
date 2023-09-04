class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        boolean[] exists = new boolean[10]; // 0부터 9까지의 숫자가 있는지 여부를 저장하는 배열

        // numbers 배열을 순회하며 존재하는 숫자를 표시
        for (int num : numbers) {
            exists[num] = true;
        }

        // 0부터 9까지의 숫자 중 존재하지 않는 숫자들을 더하기
        for (int i = 0; i <= 9; i++) {
            if (!exists[i]) {
                answer += i;
            }
        }
        
        return answer;
    }
}