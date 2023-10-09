import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[] location = new int[2];
        
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < dirs.length(); i++) {
            char a = dirs.charAt(i);
            int saveX = location[0];
            int saveY = location[1];
            String path1 = "" + location[0] + "," + location[1];
            
            
            if(a == 'U') location[0]++;
            else if(a == 'D') location[0]--;
            else if(a == 'R') location[1]++;
            else if(a == 'L') location[1]--;
            
            if(location[0] > 5 || location[0] < -5 || location[1] > 5 || location[1] < -5) {
                location[0] = saveX;
                location[1] = saveY;
                continue;
            }
            
            String path2 = "" + location[0] + "," + location[1];
            
            set.add(path1+path2);
            set.add(path2+path1);
            
        }
        
        answer = set.size() / 2;
        
        return answer;
    }
}