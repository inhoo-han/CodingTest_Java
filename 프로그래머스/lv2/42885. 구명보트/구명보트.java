import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int min = 0;
        int max = people.length - 1;
        
        while (max >= min) {
            int sum = people[max--];        //더한 뒤에 max - 1
            answer++;
            
            if(sum + people[min] <= limit) {
                min++;        
            }
            
        }
        
        return answer;
    }
}