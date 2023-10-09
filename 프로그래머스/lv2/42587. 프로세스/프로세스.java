import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i : priorities) queue.add(i);
        
        while(true) {
            answer++;
            
            int max = Integer.MIN_VALUE;
            for(int num : queue) {
                if(num > max) max = num;
            }
            
            while (true) {
                // System.out.println("location : " + location + " max : " + max);
                // for(int n : queue) System.out.println(n);
                
                int a = queue.poll();           // 가장 앞 숫자 꺼내옴
                
                
                if(a == max && location == 0) {
                    return answer;
                } else if(a == max) {
                    location--;
                    
                    break;
                } else {
                    queue.add(a);
                    if(location == 0) location = queue.size() - 1;
                    else location--;
                }
                
                
            }
            
            if(queue.size() == 0) break;
        }
        
        return answer;
    }
}