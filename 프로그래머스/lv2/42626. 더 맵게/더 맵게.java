import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : scoville) {
            pq.add(i);
        }
        
        int min = pq.peek();
        while(K > min && pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            pq.add(a + b * 2);
            answer++;
            min = pq.peek();
        }
        
        if(K > min) {
            return -1;
        }
        
        return answer;
    }
}