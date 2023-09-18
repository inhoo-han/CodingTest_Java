class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        StringBuilder stb = new StringBuilder(s).reverse();
        System.out.print(stb);
        
        for(int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(stb.charAt(i));
            String str = stb.substring(i + 1);
            int index = str.indexOf(ch);
            
            if(index != -1) {
                answer[s.length() - i - 1] = index + 1;
            } else {
                answer[s.length() - i - 1] = -1;
            }
        }
        
        return answer;
    }
}