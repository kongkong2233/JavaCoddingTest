class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() + n - 1) / n];
        
        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            int endIdx = Math.min(idx + n, my_str.length());
            answer[i] = my_str.substring(idx, endIdx);
            idx += n;
        }
        
        return answer;
    }
}