class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        for(int i = 1; i < words.length; i++) {
            String word = words[i];
            
            // [1] 이전에 나온 적이 있는 단어인지 판별
            for(int j = 0; j < i; j++) {
                if(words[j].equals(word)) {
                    return new int[]{i % n + 1, i / n + 1};
                }
            }
            
            // [2] 끝말잇기가 되는지 여부 판별
            char beforeLast = words[i-1].charAt(words[i-1].length() - 1);
            if(beforeLast != word.charAt(0)) {
                return new int[]{i % n + 1, i / n + 1};
            }
        }
        
        return answer;
    }
}