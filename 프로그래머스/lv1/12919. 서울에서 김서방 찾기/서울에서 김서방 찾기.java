class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int len = seoul.length;
        
        // [1] 배열에서 "Kim"의 위치 찾기
        for(int i = 0; i < len; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        
        return answer;
    }
}