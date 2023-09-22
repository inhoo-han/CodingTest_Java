import java.util.*;

class Solution {
    public int solution(int k, int[] tan) {
        int answer = 0;
        Arrays.sort(tan);
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : tan) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(Integer i : map.keySet()) {
            list.add(map.get(i));
        }
        
        list.sort(Collections.reverseOrder());
        
        
        int sum = 0;
        int ans = 0;
        for (Integer x : list) {
            ans++;
            sum += x;
            if (sum >= k) {
                break;
            }
        }
        
        return ans;
    }
}