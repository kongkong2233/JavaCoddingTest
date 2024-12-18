import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        
        for (int i = s; i <= e; i++) {
            char temp = ch[i];
            ch[i] = ch[e];
            ch[e] = temp;
            e--;
        }
        
        answer = String.valueOf(ch);
        return answer;
    }
}