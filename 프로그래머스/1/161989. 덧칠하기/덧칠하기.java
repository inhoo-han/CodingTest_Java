import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int index = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        
        
        if(m == 1) return section.length;
        
        
        for(int i : section) {
            list.add(i);
        }
                    
        
        while(list.size() > 0) {
            int max = list.get(0) + m - 1;
            count++;

            
            for(int i = 0; i < m; i++) {
                if(i < list.size() && list.get(i) <= max) {
                    list.remove(i);
                    i--;
                } else break;
            }
            
        }
        
        answer = count;
        
        return answer;
    }
}