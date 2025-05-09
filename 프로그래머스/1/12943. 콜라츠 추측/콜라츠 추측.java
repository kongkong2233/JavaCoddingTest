class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
                answer++;
            } else {
                num = num * 3 + 1;
                answer++;
            }
        }
        
        return answer < 500 ? answer : -1;
    }
}