import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        String n2 = Integer.toBinaryString(n);
        
        for(int i = 0; i < n2.length(); i++) {
            if(n2.charAt(i) == '1') {
                ans++;
            }
        }
        
        return ans;
    }
}