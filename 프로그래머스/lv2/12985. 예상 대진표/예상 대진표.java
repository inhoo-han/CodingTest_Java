class Solution {
    public int solution(int n, int a, int b) {
        int n2 = (int)(Math.log(n) / Math.log(2));
        int answer = n2;
        a--; 
        b--;
        
        for(int i = 1; i < n2; i++) {
            n = n/2;
            if(a/n == b/n) {
                answer--;
            } else {
                break;
            }
        }

        return answer;
    }
}