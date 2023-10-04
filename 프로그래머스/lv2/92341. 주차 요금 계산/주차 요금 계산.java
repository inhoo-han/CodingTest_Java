import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        TreeMap<String, Integer> map = new TreeMap<>();
        String carNum;
        
        int bTime = fees[0];            // 기본 시간
        int bFee = fees[1];             // 기본 요금
        int uTime = fees[2];            // 단위 시간
        int uFee = fees[3];             // 단위 요금
        int inHour = 0, inMin = 0, outHour = 0, outMin = 0;
        int time, fee;
        
        for(int i = 0; i < records.length; i++) {
            String[] str = records[i].split(" ");
            
            if(str[2].equals("IN") && i == records.length - 1) {
                carNum = str[1];

                String[] in = str[0].split(":");
                inHour = Integer.parseInt(in[0]);
                inMin = Integer.parseInt(in[1]);

                time = (23 * 60 + 59) - (inHour * 60 + inMin);
                if(map.containsKey(carNum)){
                    time += map.get(carNum);
                }
                map.put(carNum, time);

            }
            
            if(str[2].equals("IN")) {
                carNum = str[1];
            
                String[] in = str[0].split(":");
                inHour = Integer.parseInt(in[0]);
                inMin = Integer.parseInt(in[1]);
                
                for(int j = i + 1; j < records.length; j++) {
                    
                    String[] str2 = records[j].split(" ");
                    
                    if(str2[1].equals(carNum) && str2[2].equals("OUT")) {
                        String[] out = str2[0].split(":");
                        
                        outHour = Integer.parseInt(out[0]);
                        outMin = Integer.parseInt(out[1]);
                        
                        time = (outHour * 60 + outMin) - (inHour * 60 + inMin);

                        if(map.containsKey(carNum)){
                            time += map.get(carNum);
                        }
                        map.put(carNum, time);
                        break;

                    } else if (j == records.length - 1) {
                        outHour = 23;
                        outMin = 59;
                        
                        time = (outHour * 60 + outMin) - (inHour * 60 + inMin);
                        
                        if(map.containsKey(carNum)){
                            time += map.get(carNum);
                            System.out.println("time : " + time);
                        }
                        map.put(carNum, time);
                        break;

                    }
                    
                    
                }
            }
            
        }
        
        // fee = bFee;
        // if (time >= bTime) {
        //     time -= bTime;
        //     fee += ( Math.ceil(time / uTime) ) * uFee;
        // }
        
        List<Integer> values = new ArrayList<>();
        for(Integer i : map.values()){
            values.add(i);
        }
        
        int[] answer = new int[values.size()];
        for(int i = 0; i < values.size(); i++) {
            answer[i] = values.get(i);
            System.out.println(answer[i]);
            
            fee = bFee;
            if(answer[i] >= bTime) {
                answer[i] -= bTime;
                fee += ( Math.ceil((double)answer[i] / uTime) ) * uFee;
                answer[i] = fee;
                
            } else {
                answer[i] = fee;
            }
        }
        
        return answer;
    }
}