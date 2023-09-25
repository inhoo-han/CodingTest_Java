import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        int[] ele = new int[elements.length * 2];
        for(int i = 0; i < elements.length; i++) {
            ele[i] = elements[i];
            ele[i + elements.length] = elements[i];
        }
        
        for(int i = 0; i < elements.length; i++) {
            int sum = 0;
            for(int j = 1; j <= elements.length; j++) {
                sum += ele[i + j];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}