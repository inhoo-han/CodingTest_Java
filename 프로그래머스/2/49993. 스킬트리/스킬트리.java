import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] skillList = new char[skill.length()];
        
        for(int i = 0; i < skill.length(); i++) {
            skillList[i] = skill.charAt(i);
        }
        
        for(int i = 0; i < skill_trees.length; i++) {
            String str = skill_trees[i];
            Queue<Character> skillQueue = new LinkedList<>();
            
            for(int j = 0; j < str.length(); j++) {
                for(int k = 0; k < skillList.length; k++) {
                    if(str.charAt(j) == skillList[k]) {
                        skillQueue.add(str.charAt(j));
                        break;
                    }
                }
            }
            
            // skill_trees[i] = changeStr; 
            int j = 0;
            while(skillQueue.size() != 0) {
                
                if(skillList[j] == skillQueue.peek()) {
                    j++;
                    skillQueue.poll();
                } else {
                    break;
                }
            }
            if(skillQueue.size() == 0) answer++;
            
        }
        
        for(String str : skill_trees) {
            System.out.println(str);
        }
        
        return answer;
    }
}