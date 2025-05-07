class Solution {
    public String solution(String s) {
        String[] str = s.toLowerCase().split("");
        String answer = "";
        
        for (int i = 0; i < str.length; i++) {
            if (i == 0 || str[i - 1].equals(" ")) {
                answer += str[i].toUpperCase();
            } else {
                answer += str[i];
            }
        }
        
        return answer;
    }
}