class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        // [1] replaceAll 사용하여 변경
        for(int i = 0; i < words.length; i++) {
            
            s = s.replaceAll(words[i], String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        
        return answer;
    }
}