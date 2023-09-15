import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr1_bin = new String[n];
        String[] arr2_bin = new String[n];
        
        
        // [1] 주어진 숫자를 2진수로 변환
        for(int i = 0; i < n; i++) {
            arr1_bin[i] = Integer.toBinaryString(arr1[i]);
            arr2_bin[i] = Integer.toBinaryString(arr2[i]);
            
            arr1_bin[i] = addZero(arr1_bin[i], n);
            arr2_bin[i] = addZero(arr2_bin[i], n);
            System.out.println(arr1_bin[i]);
        }
        
        // [2] 벽과 공백을 확인
        
        for(int i = 0; i < n; i++) {
            String temp = "";
            
            for(int j = 0; j < arr1_bin[0].length(); j++) {
                if(arr1_bin[i].charAt(j) == '0' && arr2_bin[i].charAt(j) == '0') {
                    temp += ' ';        
                } else {
                    temp += '#';
                }
            }
            answer[i] = temp;
        }
        
        return answer;
    }
    
    public static String addZero(String input, int n) {
        if(input.length() < n) {
            int zeroNum = n - input.length();
            StringBuilder sb = new StringBuilder();
            
            for(int i = 0; i < zeroNum; i++) {
                sb.append('0');
            }
            
            sb.append(input);
            return sb.toString();
        } else {
            return input;
        }
    }
}