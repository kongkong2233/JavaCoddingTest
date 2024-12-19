class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            if (i % m == c - 1) { // 예를 들어 4로 나누었을 때 2가 나오는 값이 4 길이의 배열의 2번째 요소를 고를 수 있다
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}