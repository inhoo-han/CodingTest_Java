import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;
        
        // [1] Comparator 인터페이스 사용하여 문자열 비교
        Arrays.sort(strings, new Comparator<String>() {
                
            // [2] Comparator 인터페이스 안의 compare메서드 오버라이드
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) {
                    return 50;
                } else if (o1.charAt(n) < o2.charAt(n)) {
                    return -50;
                } else if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }
                return 0;
            }
        });
        
        return answer;
    }
}