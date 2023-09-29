import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] pro2 = new int[progresses.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            pro2[i] = (100 - progresses[i]) / speeds[i];
            pro2[i] += ( ( (100 - progresses[i] ) % speeds[i] == 0) ? 0 : 1 );
        }
        
        int a = pro2[0];
        int b = a;
        
        int idx = 0;
        int listNum = 0;
        System.out.println("a : " + a + " b : " + b + " listNum : " + listNum + " idx : " + idx);
        
        while(true) {
            
            if(a < b) {
                list.add(listNum);
                listNum = 0;
                a = b;
                
                if(idx + 1 == pro2.length) {
                    list.add(++listNum);
                    break;
                }
                
            } else {
                listNum++;
                
                if(idx + 1 == pro2.length) {
                    list.add(listNum);
                    break;
                }
                
                idx++;
                b = pro2[idx];
                
            }
            System.out.println("a : " + a + " b : " + b + " listNum : " + listNum + " idx : " + idx);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}