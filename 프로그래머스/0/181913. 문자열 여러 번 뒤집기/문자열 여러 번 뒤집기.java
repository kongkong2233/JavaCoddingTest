import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] ch = my_string.toCharArray();
        
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            
            while (a < b) {
                char temp = ch[a];
                ch[a] = ch[b];
                ch[b] = temp;
                a++;
                b--;
            }
        }
        
        answer = String.valueOf(ch);
        return answer;
    }
}