class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};        
        int answer = 0;
        
        for (int i = 0; i < a - 1; i++) {
            answer += months[i];
        }
        
        answer += b - 1;
        
        return day[answer % 7];
    }
}