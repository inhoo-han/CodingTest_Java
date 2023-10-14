import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failed = new double[N + 1];
        TreeMap<Integer, Double> map = new TreeMap<>();
        int idx = 0;
        
        for(int i = 1; i <= N; i++) {
            map.put(i, 0.0000);
        }
        
        for(int i : stages) {
            if(i != N + 1) map.put(i, map.get(i) + 1);
        }
        
        failed[1] = stages.length;
        
        for(int i = 2; i <= N; i++) {
            failed[i] = failed[i - 1] - map.get(i - 1);
        }
        
        for(int i = 1; i <= N; i++) {
            if(failed[i] != 0) map.put(i, (double)map.get(i) / failed[i]);
            else map.put(i, 0.0);
        }
        
        while(idx < N) {
            
            double max = -1.0;
            int key = 0;
            for(int i: map.keySet()) {
                if(map.get(i) > max) {
                    max = map.get(i);
                    key = i;
                }
            }
            
            answer[idx] = key;
            map.remove(key);
            idx++;
        }
        
        return answer;
    }
}