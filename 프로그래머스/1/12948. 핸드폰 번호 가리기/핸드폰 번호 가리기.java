import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String[] str = phone_number.split("");
        
        for (int i = 0; i < str.length - 4; i++) {
            str[i] = "*";
        }
        
        String answer = "";
        for (String s : str) answer += s;
        
        return answer;
    }
}