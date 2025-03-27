import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] ch = String.valueOf(n).toCharArray();
        
        for (char c : ch) {
            answer += c - '0';
        }
        
        return answer;
    }
}