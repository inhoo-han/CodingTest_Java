import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        
        // [1] 선입선출의 queue에 값 이동
        for(String i : cards1) queue1.add(i);
        for(String i : cards2) queue2.add(i);
        
        for(int i = 0; i < goal.length; i++) {
            String a = queue1.peek();
            String b = queue2.peek();
            
            if(goal[i].equals(a)) {
                queue1.poll();
            } else if (goal[i].equals(b)) queue2.poll();
            else {
                return "No";
            }
        }
        return "Yes";
    }
}