import java.util.*;

class Solution {
    public long solution(long n) {
        String nst = String.valueOf(n);
        long answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nst.length(); i++) {
            list.add((int)nst.charAt(i) - '0');
            System.out.println((int)nst.charAt(i));
        }
        
        nst = "";
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i = 0; i < list.size(); i++) {
            nst += list.get(i);
        }
        
        answer = Long.parseLong(nst);
        
        return answer;
    }
}